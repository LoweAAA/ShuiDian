package com.shuidian.dao.impl;

import com.shuidian.dao.AccountDao;
import com.shuidian.model.Account;
import com.tools.HibernateTools;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl extends HibernateTools implements AccountDao {

    String hql;

    public List<Account> getAll() {
        hql = "FROM Account";
        return getSession().createQuery(hql).list();
    }

    public List<Account> query(Integer userId, String time) {
        hql = "FROM Account a WHERE a.userId = ? AND a.time = ?";
        return getSession().createQuery(hql).setParameter(0, userId).setParameter(1, time).list();
    }

    public void add(Account account) {
        getSession().save(account);
    }

    public void delete(Integer id) {
        hql = "DELETE FROM Account a WHERE a.id = ?";
        getSession().createQuery(hql).setParameter(0, id).executeUpdate();
    }

    public void update(Account account) {
        getSession().update(account);
    }

    public List<Account> getByTimeAndRoomId(String time, String roomId) {
        hql= "FROM Account a WHERE a.time=? AND a.roomId=?";
        return getSession().createQuery(hql).setParameter(0, time).setParameter(1, roomId).list();
    }

    public List<Account> getByTimeAndStudentId(String time, Integer studentId) {
        hql= "FROM Account a WHERE a.time=? AND a.studentId=?";
        return getSession().createQuery(hql).setParameter(0, time).setParameter(1, studentId).list();
    }
}

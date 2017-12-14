package com.shuidian.dao.impl;

import com.shuidian.dao.AccountDao;
import com.shuidian.model.Account;
import com.tools.HibernateTools;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl extends HibernateTools implements AccountDao {

    String hql;

    public List<Account> query(Integer id, String time) {
        hql = "FROM Account";
        return getSession().createQuery(hql).list();
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
}
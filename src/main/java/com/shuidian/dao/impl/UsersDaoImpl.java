package com.shuidian.dao.impl;

import com.shuidian.dao.UsersDao;
import com.shuidian.model.Users;
import com.tools.HibernateTools;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersDaoImpl extends HibernateTools implements UsersDao {

    String hql;

    public List<Users> query() {
        hql = "FROM Users";
        return getSession().createQuery(hql).list();
    }

    public Users login(String username) {
        hql = "FROM Users s WHERE s.username = ?";
        return (Users) getSession().createQuery(hql).setParameter(0, username).uniqueResult();
    }

    public void add(Users users) {
        getSession().save(users);
    }

    public void update(Users users) {
        getSession().update(users);
    }

    public void delete(Integer id) {
        hql = "DELETE FROM Users u WHERE u.id = ?";
        getSession().createQuery(hql).setParameter(0, id).executeUpdate();
    }
}

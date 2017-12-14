package com.shuidian.dao.impl;

import com.shuidian.dao.AdminsDao;
import com.shuidian.model.Admins;
import com.tools.HibernateTools;
import org.springframework.stereotype.Repository;

@Repository
public class AdminsDaoImpl extends HibernateTools implements AdminsDao {

    public Admins login(String username) {
        String hql = "FROM Admins a WHERE a.username = ?";
        return (Admins) getSession().createQuery(hql).setParameter(0, username).uniqueResult();
    }
}

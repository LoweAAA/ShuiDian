package com.shuidian.service.impl;

import com.shuidian.dao.AdminsDao;
import com.shuidian.model.Admins;
import com.shuidian.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminsServiceImpl implements AdminsService{

    @Autowired
    private AdminsDao adminsDao;

    public Admins adminConfirm(String username, String password) {
        Admins admins=adminsDao.login(username);
        if(admins==null)
            return null;
        if(admins.getPassword().equals(password))
            return admins;
        else{
            return null;
        }
    }
}

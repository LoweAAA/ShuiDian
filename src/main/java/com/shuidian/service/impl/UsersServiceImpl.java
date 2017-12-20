package com.shuidian.service.impl;

import com.shuidian.dao.UsersDao;
import com.shuidian.model.Admins;
import com.shuidian.model.Users;
import com.shuidian.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersDao usersDao;
    public Users userConfirm(String username, String password) {
        Users users= usersDao.login(username);
        if(users==null)
            return null;
        if(users.getPassword().equals(password))
            return users;
        else{
            return null;
        }
    }

    public void deleteByid(Integer id) {
        usersDao.delete(id);
    }

    public void update(Users users) {
        usersDao.update(users);
    }

    public void add(Users users) {
        usersDao.add(users);
    }
}

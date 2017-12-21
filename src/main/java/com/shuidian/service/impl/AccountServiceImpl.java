package com.shuidian.service.impl;

import com.shuidian.dao.AccountDao;
import com.shuidian.model.Account;
import com.shuidian.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountDao;


    public List getAccounts() {
        return accountDao.getAll();
    }

    public List getAccountsByUserIdTime(Integer userId, String time) {
        return accountDao.query(userId,time);
    }

    public void add(Account account) {
        accountDao.add(account);
    }

    public void delete(Integer id) {
        accountDao.delete(id);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public List getByTimeAndRoomId(String time, String roomId) {
        return accountDao.getByTimeAndRoomId(time,roomId);
    }

    public List getByTimeAndStudentId(String time, Integer studentId) {
        return accountDao.getByTimeAndStudentId(time,studentId);
    }


}

package com.shuidian.service;

import com.shuidian.model.Account;

import java.util.List;

public interface AccountService {
    public List getAccounts();

    public List getAccountsByUserIdTime(Integer userId,String time);

    public void add(Account account);

    public void delete(Integer id);

    public void update(Account account);

    public List getByTimeAndRoomId(String time,String roomId);

    public List getByTimeAndStudentId(String time,Integer studentId);
}

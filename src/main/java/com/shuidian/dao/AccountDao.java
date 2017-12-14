package com.shuidian.dao;

import com.shuidian.model.Account;

import java.util.List;

public interface AccountDao {

    public List<Account> query(Integer id, String time);

    public void add(Account account);

    public void delete(Integer id);

    public void update(Account account);
}

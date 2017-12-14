package com.shuidian.dao;

import com.shuidian.model.Users;

import java.util.List;

public interface UsersDao {

    public List<Users> query();

    public Users login(String username);

    public void add(Users users);

    public void update(Users users);

    public void delete(Integer id);
}

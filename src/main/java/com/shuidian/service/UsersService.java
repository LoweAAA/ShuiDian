package com.shuidian.service;

import com.shuidian.model.Users;

public interface UsersService {

    public Users userConfirm(String username, String password);
    public void deleteByid(Integer id);
    public void update(Users users);
    public void add(Users users);
}

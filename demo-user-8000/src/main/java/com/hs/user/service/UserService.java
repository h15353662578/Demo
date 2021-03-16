package com.hs.user.service;

import com.hs.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();

    void update(User user);

    int create(User user);

    void delete(Integer userName);
}

package com.qfedu.dao;

import com.qfedu.pojo.User;

import java.util.Map;

public interface UserDao {
    User findByIdNumber(String idNumber);
    void addUser(User user);
    User findUserName();
}

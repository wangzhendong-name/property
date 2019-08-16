package com.qfedu.service;

import com.qfedu.pojo.User;

import java.util.Map;

public interface UserService {
    Map<String, Object> findByIdNumber(String idNumber);
    void addUser(User user);
}

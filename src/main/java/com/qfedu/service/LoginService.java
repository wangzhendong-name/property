package com.qfedu.service;

import com.qfedu.pojo.User;

import java.util.Map;

public interface LoginService {
    Map<String, Object> findByIdNumber(String idNumber, String password);
}

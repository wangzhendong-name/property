package com.qfedu.dao;

import com.qfedu.pojo.User;

public interface LoginDao {
    User findByIdNumber(String idNumber);
}

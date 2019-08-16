package com.qfedu.service.Impl;

import com.qfedu.dao.LoginDao;
import com.qfedu.dao.UserDao;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Map<String, Object> findByIdNumber(String idNumber) {
        User user = userDao.findByIdNumber(idNumber);
        if (user == null) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("code", 0);
            map.put("info", "账号未使用");
            return map;
        } else {
            HashMap<String, Object> map = new HashMap<>();
            map.put("code", 1);
            map.put("info", "账号已使用");
            return map;
        }
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

}

package com.qfedu.service.Impl;

import com.qfedu.dao.LoginDao;
import com.qfedu.pojo.User;
import com.qfedu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public Map<String, Object> findByIdNumber(String idNumber, String password) {
        User user = loginDao.findByIdNumber(idNumber);
        if (user == null) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("code", 3);
            map.put("info", "账号错误");
            return map;
        } else if (!user.getPassword().equals(password)) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("code", 2);
            map.put("info", "密码错误");
            return map;
        } else if (user.getAbnormalAccount() != 0) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("code", 1);
            map.put("info", "账户已冻结");
            return map;
        } else {
            HashMap<String, Object> map = new HashMap<>();
            map.put("code", 0);
            map.put("info", user);
            return map;
        }
    }
}

package com.qfedu.service;

import com.qfedu.pojo.Property;
import com.qfedu.pojo.User;
import com.qfedu.pojo.VUserInfo;

import java.util.HashMap;
import java.util.Map;

public interface PropertyService {
    Map<String, Object> findAll(Integer page, Integer limit, User user);
}

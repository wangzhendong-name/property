package com.qfedu.dao;

import com.qfedu.pojo.Property;
import com.qfedu.pojo.User;
import com.qfedu.pojo.VUserInfo;

import java.util.HashMap;
import java.util.List;

/**
 * @
 */
public interface PropertyDao {
    List<VUserInfo> findAll(User user);
}

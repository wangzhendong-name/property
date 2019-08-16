package com.qfedu.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.PropertyDao;
import com.qfedu.pojo.Property;
import com.qfedu.pojo.User;
import com.qfedu.pojo.VUserInfo;
import com.qfedu.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyDao propertyDao;

    @Override
    public Map<String, Object> findAll(Integer page, Integer limit, User user) {
        PageHelper.startPage(page, limit);
        List<VUserInfo> all = propertyDao.findAll(user);
        long total = ((Page) all).getTotal();
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("count", total);
        map.put("data", all);
        return map;
    }

}

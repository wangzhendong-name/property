package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.Impl.PropertyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class PropertyController {

    @Autowired
    private PropertyServiceImpl propertyService;

    @RequestMapping("/findAll.do")
    @ResponseBody
    public Map<String, Object> findAll(Integer page, Integer limit, User user) {
        Map<String, Object> all = propertyService.findAll(page, limit, user);
        return all;
    }

}

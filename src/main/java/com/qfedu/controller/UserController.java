package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.Impl.LoginServiceImpl;
import com.qfedu.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/findByIdNumber1.do")
    @ResponseBody
    public Map<String, Object> findByIdNumber1(String idNumber) {
        return userService.findByIdNumber(idNumber);
    }

    @RequestMapping("/addUser.do")
    @ResponseBody
    public Map<String, Object> addUser(User user) {
        userService.addUser(user);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("info", "添加成功");
        return map;
    }

    @RequestMapping("/findUserName.do")
    @ResponseBody
    public String findUserName(HttpSession session) {
        User user = (User) session.getAttribute("user");
        return user.getUserName();
    }
}

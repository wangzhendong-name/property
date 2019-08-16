package com.qfedu.controller;

import com.qfedu.service.Impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * LoginController 用户登录的 Controller 控制层
 *
 * @author  王振东
 * @date 2019/08/02
 * @version v1.0
 */
@Controller
public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping("/login.do")
    @ResponseBody
    public Map<String, Object> findByIdNumber(String idNumber, String password, HttpSession session) {
        Map<String, Object> map = loginService.findByIdNumber(idNumber, password);
        Object user = map.get("info");
        session.setAttribute("user", user);
        return map;
    }

}

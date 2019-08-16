package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class QuitController {
    @RequestMapping("/quit.do")
    public String quit(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        session.invalidate();
        return "redirect:/login.html";
    }
}

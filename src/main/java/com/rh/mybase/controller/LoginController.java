package com.rh.mybase.controller;

import com.rh.mybase.entity.User;
import com.rh.mybase.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserLogic userLogic;


    @PostMapping("/login")
    public String login(User user, HttpServletRequest request, Map map){
        Boolean check = userLogic.checkUserLogin(user);
        if (check) {
            HttpSession session = request.getSession();
            session.setAttribute("username", user.getUsername());
            return "redirect:/main.html";
        } else {
            map.put("message", "用户名或密码错误，请重新输入！");
            return "main/login.html";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("username");
        session.invalidate();
        return "redirect:/index.html";
    }

}

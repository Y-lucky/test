package com.cykj.web;

import com.cykj.bean.User;
import com.cykj.service.UserService;
import com.cykj.service.impl.UserServiceImpl;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/admin")
    public String getindex() {
        System.out.println("===============");
        return "hello";
    }

    @ResponseBody
    @RequestMapping("/login")
    public String hello(String uname, String password) {
        System.out.println(uname);
        System.out.println(password);
        User user = new User();
        user.setUname(uname);
        user.setPwd(password);
        User us = userService.selectUser(user);
        System.out.println(us);
        if (us != null) {
            return "2222";
        }
        return "1111";

    }
}

package com.zking.teamProject.controller;

import com.zking.teamProject.model.User;
import com.zking.teamProject.service.imp.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @ModelAttribute
    public void init(Model model){
        System.out.println("init........ ");

        User user = new User();

        model.addAttribute("user",user);

    }


    @RequestMapping(value = "/toList")
    @ResponseBody
    public User toList(){
        System.out.println("来了老弟");
        User user = userService.selectByPrimaryKey(1);
        System.out.println(user);

        return user;//逻辑视图名
    }

}

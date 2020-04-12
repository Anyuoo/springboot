package com.anyu.springbootjdbcdemo.controller;

import com.anyu.springbootjdbcdemo.entries.User;
import com.anyu.springbootjdbcdemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public String updateUser(User user){
        try {
            userService.update(user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/success";
    }

    @GetMapping("/finduserall")
    public String findUserAll(Model model){
        List<User> users= userService.findUserAll();
        model.addAttribute("users",users);
        return "show";
    }
    @GetMapping("/update")
    public String updateUser(String name,Model model){
        try {
            User user=userService.selectByName(name);
            model.addAttribute("users",user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "show";
    }
}

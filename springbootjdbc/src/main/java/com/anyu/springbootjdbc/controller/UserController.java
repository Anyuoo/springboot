package com.anyu.springbootjdbc.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;

@Controller
public class UserController {
    @Autowired
    private DataSource dataSource;
    @GetMapping("/source")
    public String showDataSource(Model model){
        System.out.println(dataSource.getClass().getPackage());
        model.addAttribute("source",dataSource);
        return "jdbc";
    }
}

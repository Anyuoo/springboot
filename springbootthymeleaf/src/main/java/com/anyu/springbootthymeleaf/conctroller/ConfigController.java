package com.anyu.springbootthymeleaf.conctroller;

import com.anyu.springbootthymeleaf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ConfigController {
    @GetMapping("/show")
    public String showpage(Model model, HttpServletRequest request){
        model.addAttribute("msg","hello thymeleaf");
        model.addAttribute("date",new Date());
        model.addAttribute("sex","男");
        model.addAttribute("id","1");

        List<User> list=new ArrayList<>();
        list.add(new User("1","zhangsan",14));
        list.add(new User("2","lisi",85));
        list.add(new User("3","wangmazi",55));
        list.add(new User("4","xiaoxu",36));
        model.addAttribute("list",list);

        request.setAttribute("req","httpServletRequest");
        request.getSession().setAttribute("ses","httprequestsession");
        request.getSession().getServletContext().setAttribute("con","httpservletcontext");

        model.addAttribute("id",100);
        model.addAttribute("name","shsh");
        return "index/index";
    }
    @GetMapping("/show2")
    public String show2(){
        return "index2";
    }
    @GetMapping("/show3/{id}/{name}")
    public String show3(@PathVariable String id,@PathVariable String name){
        System.out.println(id+"/t"+name);
        return "index3";
    }
}

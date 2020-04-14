package anyu.springbootshiro.controller;

import anyu.springbootshiro.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    final private String PREFIX = "pages/";

    @GetMapping("/login")
    public String login() {
        return PREFIX + "login";
    }

    @PostMapping("/login")
    public String loginLoginc(User user, Model model) {
        //获取subject,调用login
        Subject subject = SecurityUtils.getSubject();
        //创建登录令牌
        UsernamePasswordToken token = new UsernamePasswordToken(user.getName(), user.getPassword());
        //登录失败抛出异常，异常交由异常解析器处理
        try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            model.addAttribute("msg", "账户不存在");
            return PREFIX + "login";//重定向是浏览器大宋请求，URL会变，不会储存资源，被拦截
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("msg", "账户密码错误");
            return PREFIX + "login";
        }
        model.addAttribute("msg", user.getName());
        return "index";
    }

    @GetMapping("/add")
    public String addUser() {
        return PREFIX + "user/add";
    }

    @GetMapping("/update")
    public String updateUser() {
        return PREFIX + "user/update";
    }
}

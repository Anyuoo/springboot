package anyu.springbootvalidate.controller;

import anyu.springbootvalidate.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    /**
     *
     * @param page
     * @param user:key类的驼峰命名，addUser需要key,和对象名无关
     * @return
     */
    @RequestMapping("/{page}")
    public String getPage(@PathVariable String page, User user){
        return page;
    }
}

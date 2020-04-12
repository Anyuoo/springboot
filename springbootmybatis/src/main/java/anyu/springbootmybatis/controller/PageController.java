package anyu.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *页面跳转
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String getPage(@PathVariable String page){
        return page;
    }
}

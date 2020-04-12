package anyu.springbootexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefalutController {
    @RequestMapping("/info1")
    public String showInfo1(){
        String str=null;
        str.length();
        return "info";
    }
    @RequestMapping("/info2")
    public String showInfo2(){
        int a=10/0;
        return "info";
    }
//    @ExceptionHandler(value = {java.lang.NullPointerException.class})
////    public ModelAndView nullPointerHandler(Exception e){
////        ModelAndView mv=new ModelAndView();
////        mv.addObject("error",e.toString());
////        mv.setViewName("error1");
////        return mv;
////    }
}

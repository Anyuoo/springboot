package anyu.springbootvalidate.controller;

import anyu.springbootvalidate.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * @Validated:对对象进行数据校验，BindingResult数据不合法的结果集、对于每一个数据进行校验后都应该加上一个BindingResult
     * @param user
     * @param result
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(@Validated User user, BindingResult result){
        System.out.println(user.toString());
        if (result.hasErrors()){
           List<ObjectError> list=result.getAllErrors();
           for (ObjectError error : list){
               FieldError fieldError=(FieldError)error;
               System.out.println(fieldError.toString());
           }
           return "addUser";
        }
        return "success";
    }
}

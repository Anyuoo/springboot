package anyu.springbootmybatis.controller;

import anyu.springbootmybatis.entities.User;
import anyu.springbootmybatis.services.UserService;
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

    /**
     * 添加用户
     * @param user
     * @return
     */
    @PostMapping("/addUser")
    public String addUser(User user){
        try {
            userService.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/success";
    }

    /**
     * 按id查询用户
     * @return
     */
    @GetMapping("/findUserById")
    public String selectById(){
        return "addUser";
    }
    @GetMapping("/findUserAll")
    public String findUserAll(Model model){
        try{
            List<User> users= userService.findUserAll();
            model.addAttribute("users",users);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "showUsers";
    }

    /**
     * 修改用户
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/preUpdateUser")
    public String preUpdateUser(Integer id, Model model){
        try {
            User user=null;
            user=this.userService.findUserById(id);
            model.addAttribute("user",user);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "updateUser";
    }
    @PostMapping("updateUser")
    public String uptaeUser(User user){
        try {
            this.userService.updateUser(user);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }
    @GetMapping("/deleteUser")
    public String deleteUser(Integer id){
        try {
            this.userService.deleteUser(id);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }
}

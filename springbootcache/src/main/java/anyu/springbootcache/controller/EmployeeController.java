package anyu.springbootcache.controller;

import anyu.springbootcache.entities.Employee;
import anyu.springbootcache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/emp")
@ResponseBody
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/find/{name}")
    public String findByname(@PathVariable String name){
        return employeeService.findByName(name).toString();
    }

    @GetMapping("/delete")
    public String delete(int id){
        employeeService.deleteEmployee(id);
        return "ok";
    }
    @GetMapping("/update")
    public String update(Employee employee){
        employeeService.updateEmployee(employee);
        return "ok";
    }
}

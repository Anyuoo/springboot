package anyu.springbootcache.service;

import anyu.springbootcache.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public void addEmployee(Employee employee);
    public void deleteEmployee(int id);
    public void updateEmployee(Employee employee);
    public Employee findByName(String name);
    public List<Employee> findAll();
}

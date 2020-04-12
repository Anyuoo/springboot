package anyu.springbootcache.dao;

import anyu.springbootcache.entities.Employee;

import java.util.List;

public interface EmployeeDao  {
    public void addEmployee(Employee employee);
    public void deleteEmployee(int id);
    public void updateEmployee(Employee employee);
    public List<Employee> findAll();
    public Employee findByName(String name);
}

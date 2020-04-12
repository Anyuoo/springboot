package anyu.springbootcache.service.impl;

import anyu.springbootcache.dao.EmployeeDao;
import anyu.springbootcache.entities.Employee;
import anyu.springbootcache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeDao.deleteEmployee(id);
    }

    @Override
    @CachePut(value = "EMP",key = "#employee.lastName")
    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    /**
     * 查询，@Cachceable()
     * @param name
     * @return
     */
    @Override
    @Cacheable(cacheNames = "EMP",key = "#name")
    public Employee findByName(String name) {
        return employeeDao.findByName(name);
    }
    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}

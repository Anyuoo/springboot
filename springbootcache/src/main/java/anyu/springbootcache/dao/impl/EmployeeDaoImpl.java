package anyu.springbootcache.dao.impl;

import anyu.springbootcache.dao.EmployeeDao;
import anyu.springbootcache.entities.Employee;
import anyu.springbootcache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
@Resource
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeMapper.updateByPrimaryKey(employee);
    }

    @Override
    public  List<Employee> findAll() {
        List<Employee> list= (List<Employee>) employeeMapper.selectAll();
        return list;
    }

    @Override
    public  Employee findByName(String name) {
        return employeeMapper.selectByName(name);
    }
}

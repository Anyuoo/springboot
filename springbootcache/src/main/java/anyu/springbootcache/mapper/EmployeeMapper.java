package anyu.springbootcache.mapper;

import anyu.springbootcache.entities.Employee;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    Employee selectByName(String name);

    List<Employee> selectAll();

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);


}
package com.cgwx.data.mapper;

import com.cgwx.data.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author GaoWei
 * @Date 2023/6/28 - 18:08
 */

@Mapper
public interface EmployeeMapper
{
    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);
}

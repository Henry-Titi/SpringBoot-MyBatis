package com.cgwx.data.controller;

import com.cgwx.data.bean.Employee;
import com.cgwx.data.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GaoWei
 * @Date 2023/6/29 - 9:36
 */

@RestController
public class EmpController
{
    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    public Employee getEmpByID(@PathVariable("id") Integer id)
    {
        return employeeMapper.getEmpById(id);
    }
}

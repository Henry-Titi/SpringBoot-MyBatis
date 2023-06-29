package com.cgwx.data.mapper;

import com.cgwx.data.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author GaoWei
 * @Date 2023/6/28 - 17:41
 */

//这是一个操作数据库的方法
@Mapper
public interface DepartmentMapper
{
    @Select("select * from department where id=#{id}")
    Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    int updateDept(Department department);
}

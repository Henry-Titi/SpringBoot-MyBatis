package com.cgwx.data.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author GaoWei
 * @Date 2023/6/28 - 17:38
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Department
{
    private Integer id;
    private String departmentName;
}

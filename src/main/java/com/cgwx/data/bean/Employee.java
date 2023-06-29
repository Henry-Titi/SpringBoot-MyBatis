package com.cgwx.data.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author GaoWei
 * @Date 2023/6/28 - 17:36
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Employee
{
    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer dId;
}

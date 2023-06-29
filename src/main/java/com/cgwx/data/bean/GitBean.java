package com.cgwx.data.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author GaoWei
 * @Date 2023/6/29 - 17:49
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class GitBean
{
    private String gitName;
    private Integer gitNo;
    private Integer hotfix;
}

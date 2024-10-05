package com.example.dto.systemmanagement.users;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户信息编辑")
public class UserUpdateDTO {
    private String id;
    private String username;
    private String password;
    private String employeeName;
    private String hospitalId;
    private String campusId;
    private String userType;
    private Integer is_use;
    private Date updateTime;
    private String updateBy;
}

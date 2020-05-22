package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.UserRole;
import com.cjq.oos.pojo.UserRoleExample;

public interface UserRoleMapper extends SysDao<UserRole>{

    List<UserRole> selectByExample(UserRoleExample example);

}
package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.Permission;
import com.cjq.oos.pojo.Role;
import com.cjq.oos.pojo.RoleExample;

public interface RoleMapper extends SysDao<Role> {

    List<Role> selectByExample(RoleExample example);

}
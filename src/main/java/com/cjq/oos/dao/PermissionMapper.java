package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.Permission;
import com.cjq.oos.pojo.PermissionExample;

public interface PermissionMapper extends SysDao<Permission>{

    List<Permission> selectByExample(PermissionExample example);

}
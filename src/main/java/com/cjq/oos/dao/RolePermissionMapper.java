package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.RolePermission;
import com.cjq.oos.pojo.RolePermissionExample;

public interface RolePermissionMapper extends SysDao<RolePermission>{

    List<RolePermission> selectByExample(RolePermissionExample example);

}
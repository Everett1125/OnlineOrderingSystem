package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.User;
import com.cjq.oos.pojo.UserExample;

public interface UserMapper extends SysDao<User>{

    List<User> selectByExample(UserExample example);
    
    /**
     * 停用管理员账号
     * @param name
     */
    void enableStatus(String name);

    /**
     * 开启管理员账号
     * @param name
     */
    void stopStatus(String name);
}
package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.Customer;
import com.cjq.oos.pojo.CustomerExample;

public interface CustomerMapper extends CrudDao<Customer>{

    List<Customer> selectByExample(CustomerExample example);

    /**
     * 开启用户会员状态
     * @param id
     */
    void enableStatus(int id);

}
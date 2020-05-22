package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.Order;
import com.cjq.oos.pojo.OrderExample;

public interface OrderMapper extends CrudDao<Order>{

    List<Order> selectByExample(OrderExample example);

}
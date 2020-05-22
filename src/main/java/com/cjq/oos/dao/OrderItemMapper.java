package com.cjq.oos.dao;

import java.util.List;

import com.cjq.oos.pojo.OrderItem;
import com.cjq.oos.pojo.OrderItemExample;

public interface OrderItemMapper extends CrudDao<OrderItem>{

    List<OrderItem> selectByExample(OrderItemExample example);

}
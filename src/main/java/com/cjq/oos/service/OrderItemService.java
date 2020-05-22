package com.cjq.oos.service;

import java.util.List;

import com.cjq.oos.pojo.Order;
import com.cjq.oos.pojo.OrderItem;

public interface OrderItemService extends CrudService<OrderItem> {

    /**
     * 更新订单项
     * @param c
     */
    public void update(OrderItem c);

    /**
     * 根据用户id返回用户的订单项集合
     * @param cstid 用户id
     * @return
     */
    public List<OrderItem> listByCustomer(int cstid);

    /**
     * 给订单集合中的每个订单设置有哪些订单项,设置订单项对应的商品，设置每个订单总价
     * @param os 订单集合
     */
    public void fill(List<Order> os);

    /**
     * 给订单设置订单项，订单项对应的商品，订单总价
     * @param o
     */
    public void fill(Order o);

}

package com.springboot.mongodb.spbm.service;

import com.springboot.mongodb.spbm.pojo.Order;

import java.util.List;

public interface OrderService {
    public Order getByOrderNo(String orderNo);
    public Order getByOrderNoLike(String orderNo);
    public void saveOrder(Order order);
    public void removeOrderByOrderNo(String orderNo);
    public void updateOrder(Order order);
    public List<Order> getAllOrder();
    public Order findOne(String orderNo);
}

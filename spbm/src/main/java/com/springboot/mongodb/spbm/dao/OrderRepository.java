package com.springboot.mongodb.spbm.dao;

import com.springboot.mongodb.spbm.pojo.Order;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderRepository extends MongoRepository<Order, Integer> {
        Order getByOrderNo(String orderNo);
        public Order getByOrderNoLike(String orderNo);
}

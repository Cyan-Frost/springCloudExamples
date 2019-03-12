package com.springboot.mongodb.spbm.serviceImpl;

import com.springboot.mongodb.spbm.dao.OrderRepository;
import com.springboot.mongodb.spbm.pojo.Order;
import com.springboot.mongodb.spbm.service.OrderService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private MongoTemplate mongoTemplate;

    @Resource
    private OrderRepository orderRepository;

    @Override
    public Order getByOrderNo(String orderNo) {
        return orderRepository.getByOrderNoLike(orderNo);
    }

    @Override
    public Order getByOrderNoLike(String orderNo) {
        return orderRepository.getByOrderNoLike(orderNo);
    }

    @Override
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void removeOrderByOrderNo(String orderNo) {
        Query q=new Query(new Criteria("orderNo").is(orderNo));
        mongoTemplate.remove(q,Order.class);

    }

    @Override
    public void updateOrder(Order order) {
        Query q=new Query(new Criteria("orderNo").is(order.getOrderNo()));
        Update update=new Update();
        update.set("nickName", order.getNickName());
        update.set("orderNo", order.getOrderNo());
        update.set("totalPrice", order.getTotalPrice());
        mongoTemplate.updateMulti(q, update, Order.class);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order findOne(String orderNo) {
        return orderRepository.getByOrderNoLike(orderNo);
    }
}

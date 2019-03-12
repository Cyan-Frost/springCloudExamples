package com.springboot.mongodb.spbm.controller;

import com.springboot.mongodb.spbm.pojo.Order;
import com.springboot.mongodb.spbm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;


    @RequestMapping("/add")
    public String addOrder() {
        return "add";
    }

    /**
     * 添加一条数据
     * @param order
     * @return
     */
    @RequestMapping("/saveOrder")
    public String saveOrder(Order order) {
        orderService.saveOrder(order);
        return "redirect:/getall";
    }

    /**
     * 根据NO查找一条数据
     * @return
     */
    @RequestMapping("/getOrderByOrderNo")
    @ResponseBody
    public Order getOrderByOrderNo() {
        Order order=orderService.getByOrderNo("S898745");
        return order;
    }

    @RequestMapping("/findOne")
    public String findONe(String orderNo,Model model){
        Order order = orderService.findOne(orderNo);
        model.addAttribute("order",order);
        return "edit";
    }

    /**
     * 模糊查找
     * @return
     */
    @RequestMapping("/getOrderByOrderNoLike")
    @ResponseBody
    public Order getOrderByOrderNoLike() {
        //String cond="X797";
        //Pattern pattern=Pattern.compile("^.*"++".*$");
        Order order=orderService.getByOrderNoLike("X797");
        return order;
    }

    /**
     * 查询所有数据
     * @param model
     * @return
     */
    @RequestMapping("/getall")
    public String findallorder(Model model){
        List ls= orderService.getAllOrder();
        model.addAttribute("orders",ls);
        return "show";
    }

    /**
     * 根据NO删除一条数据
     * @param orderNo
     * @return
     */
    @RequestMapping("/removeOrderByOrderNo")
    public String removeOrderByOrderNo(String orderNo) {
        System.out.println("需要删除的编号是："+orderNo);
        orderService.removeOrderByOrderNo(orderNo);
        return "redirect:/getall";
    }

    /**
     * 修改数据
     * @param nickName
     * @param orderNo
     * @param totalPrice
     * @return
     */
    @RequestMapping("/updateOrder")
    public String updateOrder(String nickName,String orderNo,double totalPrice) {
        Order order=new Order();
        order.setNickName(nickName);
        order.setOrderNo(orderNo);
        order.setTotalPrice(totalPrice);
        System.out.println(nickName+orderNo+totalPrice);
        orderService.updateOrder(order);
        return "redirect:/getall";
    }
}

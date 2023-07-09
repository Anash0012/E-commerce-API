package com.Geekster.Ecommerce.Controller;

import com.Geekster.Ecommerce.Model.Order;
import com.Geekster.Ecommerce.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public void addOrder (@RequestBody Order order){
        orderService.addOrder(order);
    }

    @GetMapping("order/{Id}")
    public Optional<Order> getorder(@PathVariable Integer Id){
        return orderService.getorderbyid(Id);
    }
}
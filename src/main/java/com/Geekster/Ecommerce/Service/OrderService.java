package com.Geekster.Ecommerce.Service;

import com.Geekster.Ecommerce.Model.Order;
import com.Geekster.Ecommerce.Repository.IorderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IorderRepo iorderRepo;
    public void addOrder(Order orderEntity) {
        iorderRepo.save(orderEntity);
    }

    public Optional<Order> getorderbyid(Integer id) {
        return iorderRepo.findById(id);
    }
}

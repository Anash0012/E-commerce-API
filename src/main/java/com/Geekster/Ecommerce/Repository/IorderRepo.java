package com.Geekster.Ecommerce.Repository;

import com.Geekster.Ecommerce.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IorderRepo extends JpaRepository<Order,Integer>{
}
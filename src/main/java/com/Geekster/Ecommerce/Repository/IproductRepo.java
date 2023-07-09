package com.Geekster.Ecommerce.Repository;

import com.Geekster.Ecommerce.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IproductRepo extends JpaRepository<Product,Integer>{
    List<Product> findByproductCategory(String category);
}

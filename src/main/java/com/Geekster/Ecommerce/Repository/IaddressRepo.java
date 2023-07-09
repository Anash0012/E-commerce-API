package com.Geekster.Ecommerce.Repository;

import com.Geekster.Ecommerce.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IaddressRepo extends JpaRepository<Address,Integer> {
}

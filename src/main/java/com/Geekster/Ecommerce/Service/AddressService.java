package com.Geekster.Ecommerce.Service;

import com.Geekster.Ecommerce.Model.Address;
import com.Geekster.Ecommerce.Repository.IaddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IaddressRepo iaddressRepo;
    public void addaddress(Address address) {
        iaddressRepo.save(address);
    }


}

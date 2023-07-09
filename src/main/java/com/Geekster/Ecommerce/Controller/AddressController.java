package com.Geekster.Ecommerce.Controller;

import com.Geekster.Ecommerce.Model.Address;
import com.Geekster.Ecommerce.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public void addaddress(@RequestBody Address address){
        addressService.addaddress(address);
    }

}

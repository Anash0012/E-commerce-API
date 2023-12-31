package com.Geekster.Ecommerce.Controller;

import com.Geekster.Ecommerce.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.Geekster.Ecommerce.Model.User;
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public void adduser(@RequestBody User user) {
        userService.addUser(user);
    }
    @GetMapping("user/{id}")
    public User getuser(@PathVariable Integer id){
        return userService.getuserById(id);
    }
}

package com.Geekster.Ecommerce.Service;

import com.Geekster.Ecommerce.Model.User;
import com.Geekster.Ecommerce.Repository.IuserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IuserRepo iuserRepo;
    public void addUser(User user) {
        iuserRepo.save(user);
    }

    public User getuserById(Integer id) {
        return  iuserRepo.findUserById(id);
    }
}

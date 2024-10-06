package com.Bank.Application.Controllers.UsersControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Application.Entities.User;
import com.Bank.Application.Entities.DTO.UserDTO;
import com.Bank.Application.Services.UserServices.UserServicesImpl;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UserServicesImpl userServices;

    @PostMapping("/create")
    public boolean createUser(@RequestBody UserDTO user) {
        return userServices.createUser(user);
    }

    @PostMapping("/logIn")
    public UserDTO logIn (@RequestBody UserDTO user) {
        return userServices.logIn(user);
        
    }
    
    



}

package com.Bank.Application.Services.UserServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.Application.Entities.User;
import com.Bank.Application.Entities.DTO.UserDTO;
import com.Bank.Application.Repositories.UsersRepository.UsersRepository;
import java.util.Date;


@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    UsersRepository usersRepository;

    public boolean createUser(UserDTO user){
        if((!user.getEmail().isEmpty()) && (!user.getPassword().isEmpty()) ){

                Date aDate = new Date();
                usersRepository.save(new User(user.getEmail(), user.getPassword(), user.getName(), aDate));
                return true;
             
        }
        return false;
    }
}

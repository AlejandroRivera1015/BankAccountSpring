package com.Bank.Application.Services.UserServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Bank.Application.Entities.User;
import com.Bank.Application.Entities.DTO.UserDTO;
import com.Bank.Application.Repositories.UsersRepository.UsersRepository;
import com.Bank.Application.Utils.UUID_GENERATOR;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;

import java.util.Date;


@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    UsersRepository usersRepository;


    @Override
    public boolean createUser(UserDTO user){

        if((!user.getEmail().isEmpty()) && (!user.getPassword().isEmpty()) ){

                Date aDate = new Date();
                usersRepository.save(new User(user.getEmail(), user.getPassword(), user.getName(), aDate));
                return true;
             
        }
        return false;
    }

    @Override
    public UserDTO logIn(UserDTO user){
        System.out.println("entrooooo");

        List<User> result = usersRepository.findByEmailAndPassword(user.getEmail(),user.getPassword());
        System.out.println(result);

        if(result.size()>0){
            for(User usr : result){
                UUID_GENERATOR gen = new UUID_GENERATOR();
                return new UserDTO(user.getEmail(),user.getName(),gen.getUuid());
    
            }

        }else return new UserDTO();




        return new UserDTO();


    }


}

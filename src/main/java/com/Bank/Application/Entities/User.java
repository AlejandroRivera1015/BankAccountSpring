package com.Bank.Application.Entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private Integer id;
    private String email;
    private String password;
    private String name;
    public Date creationDate;
    private Account account;


    public User(String email, String password){
        this.email=email;
        this.password=password;
    }



    
}

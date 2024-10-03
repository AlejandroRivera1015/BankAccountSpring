package com.Bank.Application.Entities.DTO;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class UserDTO {

    private Integer id;
    private String email;
    private String name;
    private String password;

    public UserDTO(String email, String password){
        this.email = email;
        this.password = password;
    }


}


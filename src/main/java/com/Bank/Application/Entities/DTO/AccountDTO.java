package com.Bank.Application.Entities.DTO;


import  java.util.ArrayList;
import java.util.List;

public class AccountDTO {

    private Long accountNumber;
    private Double accountBalance;
    private List<CardDTO> cards = new ArrayList<>();

}

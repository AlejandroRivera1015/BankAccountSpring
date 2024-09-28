package com.Bank.Application.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private Long accountNumber;
    private String owner;
    private Double accountBalance;
    private List<Card> cards = new ArrayList<>();

}

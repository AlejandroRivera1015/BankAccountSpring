package com.Bank.Application.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor 


@Table(name = "Accounts")
public class Account {
    @Id
    private Long id;
    private Long accountNumber;
    private String owner;
    private Double accountBalance;

    @OneToMany
    private List<Card> cards = new ArrayList<>();

}

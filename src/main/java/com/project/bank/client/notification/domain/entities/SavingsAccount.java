package com.project.bank.client.notification.domain.entities;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("savings_accounts")
public class SavingsAccount extends Account {

    @Field("bank_account_code")
    private String bankAccountCode;

    @Field("balance")
    private double balance;

}

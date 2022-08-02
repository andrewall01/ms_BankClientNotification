package com.project.bank.client.notification.application.config.events;

import com.project.bank.client.notification.domain.entities.SavingsAccount;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SavingAccountCreatedEvent extends Event<SavingsAccount> {

}

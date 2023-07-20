package com.endava.ticketmanagersystem;

import com.endava.ticketmanagersystem.model.Account;
import com.endava.ticketmanagersystem.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TicketManagerSystemApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(TicketManagerSystemApplication.class, args);
        //Not a bean, I need to instantiate myself with new
        Account account = new Account("012");
        System.out.println(account);

        //a bean, so I just get it from the context
        AccountService as1 = context.getBean(AccountService.class);
        AccountService as2 = context.getBean(AccountService.class);
        System.out.println(as1.toString());
        System.out.println(as2.toString());
    }

}

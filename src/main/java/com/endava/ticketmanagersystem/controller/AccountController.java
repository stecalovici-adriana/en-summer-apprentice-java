package com.endava.ticketmanagersystem.controller;

import com.endava.ticketmanagersystem.model.Account;
import com.endava.ticketmanagersystem.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AccountController {
    //EndPoint-uri
   /* @GetMapping("/public")
    public class MyRestController(){

    }*/
    private AccountService accountService;

    /*
    AccountService will get injected here after it is created
     */
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
        System.out.println("Creating Account Controller");
    }

    @GetMapping("/api/account/{resourceId}")
    public String getAccount(@PathVariable String resourceId){
        return accountService.getAccount(resourceId);
    }

    @GetMapping("/api/accounts")
    public List<Account> getAccount(){
        return accountService.getAccounts();
    }
}

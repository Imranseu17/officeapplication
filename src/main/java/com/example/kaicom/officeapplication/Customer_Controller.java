package com.example.kaicom.officeapplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Customer_Controller {

    @Autowired
    Customer_Dao customer_dao;

    @Autowired
    Card_History_Dao card_history_dao;

    @Autowired
    Error_History_Dao error_history_dao;

    @GetMapping("/findByID/{id}")
    public Optional<Customer_info> findByID(@PathVariable("id") int id){
        return customer_dao.findById(id);
    }

    @GetMapping("/findByName/{name}")
    public Optional<Customer_info> findName(@PathVariable("name") String name){
        return Optional.ofNullable(customer_dao.findByName(name));
    }

    @GetMapping("/findByAccountNo/{accountNo}")
    public Optional<Customer_info> findAccountNo(@PathVariable("accountNo") String accountNo){
        return Optional.ofNullable(customer_dao.findByAccountNo(accountNo));
    }

    @GetMapping("/findByCardNo/{cardNo}")
    public Optional<Customer_info> findCardNo(@PathVariable("cardNo") String cardNo){
        return Optional.ofNullable(customer_dao.findByCardNo(cardNo));
    }

    @GetMapping("/findcard_history/{cardNo}")
    public List<Card_History> findcard_history(@PathVariable("cardNo") String cardNo){

       return card_history_dao.findAllByCardNo(cardNo);
    }









}

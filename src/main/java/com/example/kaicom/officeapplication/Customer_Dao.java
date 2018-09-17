package com.example.kaicom.officeapplication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_Dao extends JpaRepository<Customer_info,Integer> {
        Customer_info findByName(String Name);
        Customer_info findByAccountNo(String accountNO);
        Customer_info findByCardNo(String cardNO);
}

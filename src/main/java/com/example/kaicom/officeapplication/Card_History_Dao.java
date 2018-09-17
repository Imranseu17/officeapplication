package com.example.kaicom.officeapplication;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Card_History_Dao extends JpaRepository<Card_History,Integer> {
       List<Card_History> findAllByCardNo(String cardNO);

}

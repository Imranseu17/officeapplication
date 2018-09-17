package com.example.kaicom.officeapplication;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Error_History_Dao extends JpaRepository<Error_History,Integer> {
       List<Error_History> findAllByCardNo(String cardNO);
}

package com.example.kaicom.officeapplication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Dao extends JpaRepository<User_Info,Integer> {

    User_Info findByUsernameAndPassword(String username, String password);
}

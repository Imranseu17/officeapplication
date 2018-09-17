package com.example.kaicom.officeapplication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class User_Controller {

    @Autowired
    User_Dao user_dao;


    @PostMapping(value = "/loginJava")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password){
      User_Info user_info =   user_dao.findByUsernameAndPassword(username,password);
        if(user_info != null)
        {
            return "Data Matched";
        }
        return "Invalid Username or Password Please Try Again";
    }


}

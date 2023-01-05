package com.password.password.Service;

import com.password.password.Entity.Login;
import com.password.password.Repository.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public  String save(Login login){
        login.setAndEncryptPassword(login.getPassword());
        loginRepository.save(login);
        return "success";


    }
    }







package com.password.password.Controller;


import com.password.password.Entity.Login;
import com.password.password.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/saveUsers")
     public void  saveTest(@RequestBody Login login) {
        loginService.save(login);



    }
}

package com.example.Login.Controller;

import com.example.Login.Model.Login;
import com.example.Login.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping(Login)
    public List<Login> AllUsers(){
    return loginService.AllUsers();
    }
}

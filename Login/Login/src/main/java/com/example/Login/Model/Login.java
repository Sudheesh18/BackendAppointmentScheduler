package com.example.Login.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Login {
    @Id
    int id;
    String role;
    String name;
    String phone;
    String mail;
    String password;


}

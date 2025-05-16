package com.example.Login.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Doctor {

    @Id
    int id;
    Login login;
    String specialization;
    String experience;



}

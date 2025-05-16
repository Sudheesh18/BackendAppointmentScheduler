package com.example.Login.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Appointment {

    @Id
    int id;
    String date;
    String time;
    String status;
    Doctor doctor;
    Login login;


}

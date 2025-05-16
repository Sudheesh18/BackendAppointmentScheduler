package com.example.Login.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {

    @GetMapping("/dentist")
    public List<String> getAvailableDentist(){
        return AppointmentService.getAvaialbleDentist;
    }


}

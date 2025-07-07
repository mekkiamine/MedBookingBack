package com.MAM.MedBooking.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/Hello")
    public String Hello() {
        return "Hello World";
    }
}

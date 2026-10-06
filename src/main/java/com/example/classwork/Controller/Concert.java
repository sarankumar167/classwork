package com.example.classwork.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class Concert {

    @GetMapping("/concert")
    public String concert() {
        return "Concert";
    }
}



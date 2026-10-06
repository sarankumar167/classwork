package com.example.classwork.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class Portfolio {

    @GetMapping("/portfolio")
    public String portfolio() {
        return "Portfolio";
    }
}



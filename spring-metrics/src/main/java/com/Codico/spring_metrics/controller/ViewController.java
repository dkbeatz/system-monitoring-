package com.Codico.spring_metrics.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String dashboard() {
        return "dashboard";
    }
}

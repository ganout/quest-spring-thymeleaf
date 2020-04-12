package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @GetMapping("/doctor/")
    public String doctor(@RequestParam(required=true, defaultValue="0") int number,
                         @RequestParam(required=true, defaultValue="John Smith") String name, Model model) {

        String doctorname = name;
        int doctornumber = number;

        model.addAttribute("doctorname", doctorname);
        model.addAttribute("doctornumber", doctornumber);

        return "doctor";
    }
}

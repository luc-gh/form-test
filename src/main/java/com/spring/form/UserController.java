package com.spring.form;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        System.out.println("GET OK");
        return "form";
    }

    @PostMapping("/form")
    public String submitForm(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("user", user);
        System.out.println("POST OK");
        return "response";
    }
}




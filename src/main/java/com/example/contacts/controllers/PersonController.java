package com.example.contacts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.contacts.models.Person;

@Controller
public class PersonController {

    @GetMapping("/")
    public String index(@ModelAttribute Person person) {
        return "person/index";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute Person person, BindingResult result) {

        if (result.hasErrors()) {
            return "person/index";
        }
        return "person/create";
    }
}

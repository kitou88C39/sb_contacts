
package com.example.contacts.controllers;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.contacts.models.Person;
import com.example.contacts.repository.PersonRepository;

@Controller
public class PersonController {

    // 中略

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute Person person, BindingResult result, Model model) {
        // 中略
    }

    @GetMapping("/delete/{id}") // 初期データの投入
    public String remove(@PathVariable long id) {
        repository.deleteById(id);
        return "redirect:/";
    }

    // 初期データの投入
    @PostConstruct
    public void dataInit() {
        // 中略
    }
}

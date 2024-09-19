package com.example.lab4.controller;

import com.example.lab4.entity.Flores;
import com.example.lab4.repository.FloresRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class FloresController {

    final FloresRepository floresRepository;

    public FloresController(FloresRepository floresRepository) {
        this.floresRepository = floresRepository;
    }

    @GetMapping(value = {"/list", ""})
    public String listarFlores(Model model) {

        model.addAttribute("lista", floresRepository.findAll());
        return "/list";
    }

    @ResponseBody
    @GetMapping(value = {"/entretenimiento", ""})
    public String entretenimiento(Model model) {

        return "Entretenimiento";
    }
    @ResponseBody
    @GetMapping(value = {"/carrito", ""})
    public String Carrito(Model model) {


        return "Carrito";
    }
}


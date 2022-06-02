package com.cac.labs.petclinic.controllers;

import com.cac.labs.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService service;

    public VetController(VetService service) {
        this.service = service;
    }

    @RequestMapping("/vets")
    public String listVets(Model model) {
        model.addAttribute("vets", service.findAll());
        return "vets/index";
    }
}

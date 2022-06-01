package com.cac.labs.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnersController {

    @RequestMapping({"","/"})
    public String owners() {
        return "owners/index";
    }
}

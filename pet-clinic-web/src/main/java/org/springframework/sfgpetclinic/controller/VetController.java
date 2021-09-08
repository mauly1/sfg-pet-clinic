package org.springframework.sfgpetclinic.controller;

import org.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets.html","/vets/index.html"})
    public String listVets(Model model){

        model.addAttribute("vets",vetService.findaAll());
        return "vets/index";
    }
}

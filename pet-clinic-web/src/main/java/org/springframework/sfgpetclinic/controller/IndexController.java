package org.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"", "/" , "index", "index.html"})
    public String index(){
        System.out.println("--------------index controller--------------");

        return "index";
    }
    @RequestMapping({"/oups"})
    public String oupsHandler(Model model) {
        //model.addAttribute("owners",ownerService.findAll());
        return "NotImplemented";
    }
}

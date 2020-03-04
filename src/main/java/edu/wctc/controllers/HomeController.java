package edu.wctc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // this is telling what page to show, in this case start at the root
    @RequestMapping("/")
    public String showHomePage() {

        return "index";
    }

}
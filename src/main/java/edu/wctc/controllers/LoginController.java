package edu.wctc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    // this is telling what page to show, in this case start at the root
    @RequestMapping("/loginPage")
    public String showLoginPage() {

        return "login/login";
    }
}
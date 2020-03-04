package edu.wctc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/list")
public class ListController {

    // this is telling what page to show, in this case start at the root
    @RequestMapping("/listPage")
    public String showDetailPage() {

        return "list/list";
    }
}
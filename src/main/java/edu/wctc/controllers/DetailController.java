package edu.wctc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/details")
public class DetailController {

    // this is telling what page to show, in this case start at the root
    @RequestMapping("/detailPage")
    public String showDetailPage() {

        return "detail/detail";
    }
}
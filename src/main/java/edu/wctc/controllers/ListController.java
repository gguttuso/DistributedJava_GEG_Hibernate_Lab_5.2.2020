package edu.wctc.controllers;

import edu.wctc.entity.Item;
import edu.wctc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/list")
public class ListController {

    // Inject the Item Service
    @Autowired
    private ItemService itemService;

    // this is telling what page to show, in this case start at the root
    @RequestMapping("/listPage")
    public String listItems(Model theModel) {

        List<Item> itemList = itemService.getItems();

        return "list/list";
    }
}
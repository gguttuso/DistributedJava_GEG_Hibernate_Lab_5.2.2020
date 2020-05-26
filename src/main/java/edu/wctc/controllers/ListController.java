package edu.wctc.controllers;

import edu.wctc.entity.Item;
import edu.wctc.entity.ItemDetail;
import edu.wctc.service.ItemDetailService;
import edu.wctc.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/list")
public class ListController {

    // Inject the Item Service
    @Autowired
    private ItemService itemService;
    private ItemDetailService itemDetailService;

//    @Autowired
//    private ItemDetailService itemDetailService;

    @GetMapping("/showAddItemForm")
    public String showAddItemForm(Model theModel){
        Item theItem = new Item();
        ItemDetail theItemDetail = new ItemDetail();

        theModel.addAttribute("aItem", theItem);
        theModel.addAttribute("aItemDetail", theItemDetail);

        theModel.addAttribute("name", itemDetailService.getItemDetails());

        return "detail/detail";
    }

    // this is telling what page to show, in this case start at the root
    @RequestMapping("/listPage")
    public String listItems(Model theModel) {

        List<Item> itemList = itemService.getItems();

        // Add the list of donuts to the model
        theModel.addAttribute("items", itemList);

        return "list/list";
    }

    @PostMapping("/save")
    public String saveItem(@ModelAttribute("item") Item theItem){
        itemService.saveItem(theItem);
        return "redirect:/list/listPage";
    }
}
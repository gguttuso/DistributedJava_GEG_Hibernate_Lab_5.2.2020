package edu.wctc.service;

import edu.wctc.entity.Item;

import java.util.List;

public interface ItemService {
    void deleteItem(int theId);

    Item getItem(int theId);

    List<Item> getItems();

    List<Item> getItemsByName(String theSearchTerm);

    void saveItem(Item theItem);

}

package edu.wctc.service;

import edu.wctc.entity.Item;
import edu.wctc.entity.ItemDetail;

import java.util.List;

public interface ItemService {
    void deleteItem(int theId);

    Item getItem(int theId);

    List<ItemDetail> getItems();

    List<Item> getItemsByName(String theSearchTerm);

    void saveItem(Item theItem);

}

package edu.wctc.dao;

import edu.wctc.entity.Item;
import edu.wctc.entity.ItemDetail;

import java.util.List;

public interface ItemDAO {
    List<ItemDetail> getItems();

    void saveItem(Item theItem);

    Item getItem(int theId);

    void deleteItem(int theId);

    List<Item> getItemsByName(String theSearchTerm);
}

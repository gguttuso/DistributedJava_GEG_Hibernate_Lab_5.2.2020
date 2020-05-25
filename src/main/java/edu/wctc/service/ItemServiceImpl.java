package edu.wctc.service;

import edu.wctc.dao.ItemDAO;
import edu.wctc.entity.Item;
import edu.wctc.entity.ItemDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    // inject Donut DAO
    @Autowired
    private ItemDAO itemDAO;

    @Override
    @Transactional
    public void deleteItem(int theId) {
        itemDAO.deleteItem(theId);
    }

    @Override
    @Transactional
    public Item getItem(int theId) {
        return itemDAO.getItem(theId);
    }

    @Override
    // with @Transactional annotation, no need to begin or commit transaction
    @Transactional
    public List<ItemDetail> getItems() {
        // Delegate call to DAO
        return itemDAO.getItems();
    }

    @Override
    @Transactional
    public List<Item> getItemsByName(String theSearchTerm) {
        return itemDAO.getItemsByName(theSearchTerm);
    }
    @Override
    @Transactional
    public void saveItem(Item theItem) {
        // Delegate call to DAO
        itemDAO.saveItem(theItem);
    }
}

package edu.wctc.service;

import edu.wctc.dao.ItemDetailDAO;
import edu.wctc.entity.ItemDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemDetailServiceImpl implements ItemDetailService{

    // inject Item Detail DAO
    @Autowired
    private ItemDetailDAO itemDetailDAO;


    @Override
    @Transactional
    public List<ItemDetail> getItemDetails() {
        return itemDetailDAO.getItemDetails();
    }

    @Override
    @Transactional
    public ItemDetail getItemDetail(int Id) {
        return itemDetailDAO.getItemDetail(Id);
    }

    @Override
    public void saveItemDetail(ItemDetail theDetailItem) {
        // Delegate call to DAO
        itemDetailDAO.saveItemDetail(theDetailItem);
    }

    @Override
    public void deleteItemDetail(int theId) {
            itemDetailDAO.deleteItemDetail(theId);
    }

}

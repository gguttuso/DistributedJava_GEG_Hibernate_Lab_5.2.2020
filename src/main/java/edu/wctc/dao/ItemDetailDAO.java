package edu.wctc.dao;

import edu.wctc.entity.ItemDetail;

import java.util.List;
public interface ItemDetailDAO {
    List<ItemDetail> getItemDetails();

    void saveItemDetail(ItemDetail theItemDetail);

    ItemDetail getItemDetail(int theId);

    void deleteItemDetail(int theId);

}

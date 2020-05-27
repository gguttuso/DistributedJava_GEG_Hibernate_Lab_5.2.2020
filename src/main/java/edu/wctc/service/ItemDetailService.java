package edu.wctc.service;

import edu.wctc.entity.ItemDetail;

import java.util.List;

public interface ItemDetailService {

    List<ItemDetail> getItemDetails();

    ItemDetail getItemDetail(int theId);

    void saveItemDetail(ItemDetail theDetailItem);

    void deleteItemDetail(int theId);

}

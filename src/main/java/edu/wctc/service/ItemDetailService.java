package edu.wctc.service;

import edu.wctc.entity.ItemDetail;

import java.util.List;

public interface ItemDetailService {

    List<ItemDetail> getItemDetails();

    List<ItemDetail> getItemDetail();

    void saveItemDetail(ItemDetail theDetailItem);

    void deleteItemDetail(int theId);

}

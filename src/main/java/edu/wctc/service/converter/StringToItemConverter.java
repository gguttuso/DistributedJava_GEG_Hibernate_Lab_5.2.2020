package edu.wctc.service.converter;

import edu.wctc.entity.ItemDetail;
import edu.wctc.service.ItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToItemConverter implements Converter<String, ItemDetail> {

    @Autowired
    private ItemDetailService itemDetailService;

    @Override
    public ItemDetail convert(String s) {
        int itemId = Integer.parseInt(s);
        ItemDetail aItem = itemDetailService.getItemDetail(itemId);

        return aItem;
    }
}

package edu.wctc.entity;

public class Item {
    private int id;
    private String name;
    private ItemDetail detail;

    public Item() {

    }

    public ItemDetail getDetail() {
        return detail;
    }

    public void setDetail(ItemDetail detail) {
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}








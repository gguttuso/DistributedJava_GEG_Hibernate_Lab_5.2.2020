package edu.wctc.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "item_detail")
public class ItemDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int id;

    @Column(name = "size")
    private double size;

    public ItemDetail() {
        // no-arg constructor
    }

    public ItemDetail(double size) {
        this.size = size;
    }
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

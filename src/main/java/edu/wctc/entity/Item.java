package edu.wctc.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int id;

    @ManyToOne(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "item_id")
    private ItemDetail detail;

    @NotNull(message = "required")
    @Size(min = 1, max = 30, message = "1-30 characters")
    @Column(name = "nm")
    private String name;

    public Item() {
        // no-arg constructor
    }

    public Item(String name) {
        this.name = name;
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







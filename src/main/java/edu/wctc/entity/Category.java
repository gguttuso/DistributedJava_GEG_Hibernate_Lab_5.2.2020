package edu.wctc.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int id;
    @Column(name = "nm")
    private String name;

    @ManyToMany(cascade = {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinTable(name = "item",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<ItemDetail> details;

    public Category() {
        // no-arg constructor
    }

    public Category(String name){
        this.name = name;
    }

    public void add(ItemDetail tempDetail){
        if(details == null){
            details = new ArrayList<>();
        }
        details.add(tempDetail);
    }
}

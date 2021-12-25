package com.administartor.server.entities;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="menu")
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String typeOfDish;
    private String dishName;
    private int price;
    private int quantityInStock;
    private boolean goList;

    @OneToMany(mappedBy = "menu")
    Set<DishOrderEntity> dishOrder;

    public MenuEntity(){

    }


    public boolean isGoList() {
        return goList;
    }

    public void setGoList(boolean goList) {
        this.goList = goList;
    }

    public Set<DishOrderEntity> getDishOrder() {
        return dishOrder;
    }

    public void setDishOrder(Set<DishOrderEntity> dishOrder) {
        this.dishOrder = dishOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeOfDish() {
        return typeOfDish;
    }

    public void setTypeOfDish(String typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}

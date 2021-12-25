package com.administartor.server.entities;

import javax.persistence.*;

@Entity
@Table(name="dishOrder")
public class DishOrderEntity {
    @EmbeddedId
    private DishOrderKey id;

    @ManyToOne
    @MapsId("menuId")
    @JoinColumn(name="menu_id")
    private MenuEntity menu;

    @ManyToOne
    @MapsId("ordersId")
    @JoinColumn(name="orders_id")
    private MenuEntity orders;

    private int amountDishes;



    public DishOrderEntity(){

    }

    public DishOrderKey getId() {
        return id;
    }

    public void setId(DishOrderKey id) {
        this.id = id;
    }

    public MenuEntity getMenu() {
        return menu;
    }

    public void setMenu(MenuEntity menu) {
        this.menu = menu;
    }

    public MenuEntity getOrders() {
        return orders;
    }

    public void setOrders(MenuEntity orders) {
        this.orders = orders;
    }

    public int getAmountDishes() {
        return amountDishes;
    }

    public void setAmountDishes(int amountDishes) {
        this.amountDishes = amountDishes;
    }
}

package com.administartor.server.entities;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="orders")
public class OrdersEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private WaitersEntity waitersEntity;


    private int orderPrice;
    private boolean orderStatus;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date orderTime;

    @OneToMany(mappedBy = "orders")
    Set<DishOrderEntity> dishOrder;

    public OrdersEntity(){

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

    public WaitersEntity getWaitersEntity() {
        return waitersEntity;
    }

    public void setWaitersEntity(WaitersEntity waitersEntity) {
        this.waitersEntity = waitersEntity;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
}

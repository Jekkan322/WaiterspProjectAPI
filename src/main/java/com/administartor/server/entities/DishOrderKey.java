package com.administartor.server.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DishOrderKey implements Serializable {

    @Column(name="menu_id")
    Long menuId;

    @Column(name="orders_id")
    Long ordersId;

}

package com.administartor.server.service;

import com.administartor.server.entities.OrdersEntity;
import com.administartor.server.repositories.MenuRepository;
import com.administartor.server.repositories.OrdersRepository;
import com.administartor.server.repositories.WaitersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    @Autowired
    OrdersRepository ordersRepository;

    @Autowired
    WaitersRepository waitersRepository;

    @Autowired
    MenuRepository menuRepository;

    
    /*public OrdersEntity OrderCompleted(){

    }*/

}

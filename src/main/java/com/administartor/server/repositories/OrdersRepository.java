package com.administartor.server.repositories;

import com.administartor.server.entities.OrdersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<OrdersEntity,Long> {
}

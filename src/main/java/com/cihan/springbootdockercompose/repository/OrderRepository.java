package com.cihan.springbootdockercompose.repository;

import com.cihan.springbootdockercompose.model.Order;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<Order, Integer> {
}

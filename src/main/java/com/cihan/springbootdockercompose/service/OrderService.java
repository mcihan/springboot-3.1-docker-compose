package com.cihan.springbootdockercompose.service;

import com.cihan.springbootdockercompose.model.Order;
import com.cihan.springbootdockercompose.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

}


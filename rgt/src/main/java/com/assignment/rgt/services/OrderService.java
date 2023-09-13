package com.assignment.rgt.services;

import com.assignment.rgt.entities.Order;

import java.util.List;

public interface OrderService {
    Order createOrder(Order order);

    List<Order> getAllOrders();
}

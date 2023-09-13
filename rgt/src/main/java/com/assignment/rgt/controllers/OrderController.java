package com.assignment.rgt.controllers;

import com.assignment.rgt.entities.Order;
import com.assignment.rgt.services.OrderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/codingTest")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/get")
    public ResponseEntity<?> getAllOrder() {
        List<Order> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @PostMapping("/post")
    public ResponseEntity<?> createOrder(@RequestBody Order order) {
        Order savedOrder = orderService.createOrder(order);
        String response = "<pre>" + savedOrder + "</pre> 주문번호 : "
                + savedOrder.getOrderId() + " : " + "수신";
        return ResponseEntity.ok(response);
    }
}

package com.gui_motas.workshop_spring_jpa.resources;


import com.gui_motas.workshop_spring_jpa.entities.Order;
import com.gui_motas.workshop_spring_jpa.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    @Autowired
    OrderService OrderS;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = OrderS.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = OrderS.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    
}
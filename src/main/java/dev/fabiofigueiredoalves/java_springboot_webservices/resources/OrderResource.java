package dev.fabiofigueiredoalves.java_springboot_webservices.resources;

import dev.fabiofigueiredoalves.java_springboot_webservices.entities.Order;
import dev.fabiofigueiredoalves.java_springboot_webservices.entities.User;
import dev.fabiofigueiredoalves.java_springboot_webservices.services.OrderService;
import dev.fabiofigueiredoalves.java_springboot_webservices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        List<Order> ordersList = orderService.findAll();
        return ResponseEntity.ok().body(ordersList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order order = orderService.findById(id);
        return ResponseEntity.ok().body(order);
    }

}

package com.example.orderservice;

import com.example.orderservice.kafka.OrderProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping
    public String createOrder(@RequestParam String item) {

        orderProducer.sendOrderEvent(item);

        return "Order placed for: " + item;
    }
}
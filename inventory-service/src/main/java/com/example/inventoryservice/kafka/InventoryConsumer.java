package com.example.inventoryservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryConsumer {

    @KafkaListener(topics = "orders", groupId = "inventory-group")
    public void consume(String message) {

        System.out.println("Inventory updated for order: " + message);

    }
}
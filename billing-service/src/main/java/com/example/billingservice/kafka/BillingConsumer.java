package com.example.billingservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BillingConsumer {

    @KafkaListener(topics = "orders", groupId = "billing-group")
    public void consume(String message) {

        System.out.println("Billing generated for order: " + message);

    }
}
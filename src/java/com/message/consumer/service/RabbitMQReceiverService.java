package com.message.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQReceiverService {

    @RabbitListener(queues = {"spaceQueue"})
    public void receive(String message) {
        log.info(message +  " - from queue");
    }
}

package com.example.subscriberapi.pubsub;

import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.cloud.gcp.pubsub.support.PubSubHeaders;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class PubSubSubscriber {
    private final PubSubTemplate pubSubTemplate;

    // Messageを受け取る
    public PubSubSubscriber(PubSubTemplate pubSubTemplate) {
        this.pubSubTemplate = pubSubTemplate;
    }

    // Messageを処理する
    @ServiceActivator(inputChannel = "pubsubInputChannel")
    public void receiveMessage() {
        String payload = pubSubTemplate.getPayload();
        String messageId = pubSubTemplate.getHeaders().get(PubSubHeaders.MESSAGE_ID, String.class);

        System.out.println("Received message: " + payload);
        System.out.println("Message ID: " + messageId);
    }
}
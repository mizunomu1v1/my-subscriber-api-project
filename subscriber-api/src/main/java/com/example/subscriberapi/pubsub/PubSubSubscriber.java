package com.example.subscriberapi.pubsub;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Sink.class)
public class PubSubSubscriber {

	@StreamListener(Sink.INPUT)
	public void receiveMessage(String message) {
		// メッセージを受信したときの処理
		System.out.println("Received message: " + message);
	}
}
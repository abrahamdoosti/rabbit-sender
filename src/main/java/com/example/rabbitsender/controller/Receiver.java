package com.example.rabbitsender.controller;

import java.util.concurrent.CountDownLatch;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Receiver {

	private CountDownLatch latch = new CountDownLatch(1);

	public void receiveMessage(String message) {
		log.info("Message Received: {}", message);
		//System.out.println("Received <" + message + ">");
		//latch.countDown();
	}

	public CountDownLatch getLatch() {
		return latch;
	}

}

package com.example.rabbitsender.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class RabbitSenderTest {

	@GetMapping("/all")
	public String getRabbitSender() {
		return "You have reached test end poitn for RabbitSender!";

	}

}

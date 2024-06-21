package com.wipro.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gc")
public class GreetingController {
	@Value("${server.port}")
	private String serverPort;
	
	@Value("${eureka.instance.instance-id}")
   private String instanceId;
	
		@GetMapping("/greet")
		public String greetings() {
			return "Hello, Welcome to Spring Microservices: "+ serverPort+ ","+ instanceId;
		}
}

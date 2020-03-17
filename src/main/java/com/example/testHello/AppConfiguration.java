package com.example.testHello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// declare as a controller
@RestController

public class AppConfiguration {

	// declare as a path like apI

	@RequestMapping("/hello")
	public String hello() {
		return "hello bhai2";
	}

}

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/testing")
	public static String test(@RequestParam(value = "fullName", defaultValue = "Hello World") String fullName) {
		return fullName;
	}
}

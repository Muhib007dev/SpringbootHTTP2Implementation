package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	String name = "hello";

	@RequestMapping("/testing")
	public TestModel test(@RequestParam(value = "fullName", defaultValue = "Hello World") String fullName) {
		TestModel md = new TestModel();

		String name[] = fullName.split(" ");

		md.setFirstName(name[0]);
		md.setLastName(name[1]);

		return md;
	}
}

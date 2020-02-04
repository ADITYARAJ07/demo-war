package com.example.demoWar;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//commit test
@RestController
public class DemoRestController {

	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String respondHelloWorld() {
		System.out.println("Push check 123");
		System.out.println("API hit.");
		return "Hello World";
	}
}

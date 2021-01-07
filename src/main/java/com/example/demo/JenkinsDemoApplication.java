package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class JenkinsDemoApplication {
	
	
	@RequestMapping("/hello/{name}")
	@ResponseBody
    String home(@PathVariable("name") String name) {
		return "Hello "+ name;	
		}
	
    public static void main(String[] args) throws Exception{
    SpringApplication.run(JenkinsDemoApplication.class, args);
   }
}

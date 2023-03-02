package com.rest_client.Rest_Invoker.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest_client.Rest_Invoker.RestConsumer.RestTemplateConsumer;
import com.rest_client.Rest_Invoker.model.Users;

@RestController
@RequestMapping("/api/users")
public class RestTemplateController {

	@Autowired
	private RestTemplateConsumer restTemplateConsumer;
	
	@GetMapping("/getForEntity")
	public Users getForEntity(){
		return restTemplateConsumer.getForEntity();
		
	}
	
	@GetMapping("/getForObject")
	public Users getForObject(){
		return restTemplateConsumer.getForObject();
		
	}
	
	@GetMapping("/getHeaders")
	public Map<String, String> getHeaders(){
		return restTemplateConsumer.getHeaders();
		
	}
	
	
}

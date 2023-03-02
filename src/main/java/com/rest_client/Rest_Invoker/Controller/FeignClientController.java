package com.rest_client.Rest_Invoker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest_client.Rest_Invoker.RestConsumer.feignClientConsumer;
import com.rest_client.Rest_Invoker.model.Users;

@RestController
public class FeignClientController {

	@Autowired
	private feignClientConsumer feignClientConsumer;
	
	
	  @GetMapping("/fiegn-client") public Users getUserByFeign() { Users result =
	  feignClientConsumer.getUserByFeign(); return result; }
	 
	
	
}

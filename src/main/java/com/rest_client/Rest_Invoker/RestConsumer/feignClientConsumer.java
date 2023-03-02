package com.rest_client.Rest_Invoker.RestConsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rest_client.Rest_Invoker.model.Users;

@FeignClient(value = "userDetails",url = "https://api.github.com")
public interface feignClientConsumer {
	
	  @RequestMapping(method = RequestMethod.GET, value = "/users/amila", produces
	  = "application/json") Users getUserByFeign();
	 
}

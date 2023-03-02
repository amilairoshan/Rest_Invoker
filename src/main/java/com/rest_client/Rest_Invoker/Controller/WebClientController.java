package com.rest_client.Rest_Invoker.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest_client.Rest_Invoker.RestConsumer.WebClientConsumer;
import com.rest_client.Rest_Invoker.model.Users;

import reactor.core.publisher.Mono;

@RestController
public class WebClientController {

	@Autowired
	private WebClientConsumer webClient; 
	
	@GetMapping(value = "/webClient", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<Users> getWebClient(){
		return webClient.webClientConsumer();
	}
	
}

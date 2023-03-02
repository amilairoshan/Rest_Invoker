package com.rest_client.Rest_Invoker.RestConsumer;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.rest_client.Rest_Invoker.model.Users;

import reactor.core.publisher.Mono;

@Component
public class WebClientConsumer {

	private static final  String user_url="https://api.github.com/users/amila";
	
	public Mono<Users> webClientConsumer(){
		Mono<Users> monoUsers = WebClient.create()
			      .get()
			      .uri(user_url)
			      .retrieve()
			      .bodyToMono(Users.class);
		return monoUsers;
	}
	
	
}

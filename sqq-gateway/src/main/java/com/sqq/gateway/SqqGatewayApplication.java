package com.sqq.gateway;

import com.sqq.gateway.resolve.UriKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SqqGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqqGatewayApplication.class, args);
	}

	@Bean
	public UriKeyResolver uriKeyResolver() {
		return new UriKeyResolver();
	}

}

package com.sqq.user;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Slf4j
@EnableEurekaClient
@EnableTransactionManagerServer
@SpringBootApplication
public class SqqTxManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SqqTxManagerApplication.class, args);
	}

}

package com.sqq.activity;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Slf4j
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"com.sqq.activity"})
@MapperScan(basePackages = {"com.sqq.activity.mapper"})
public class SqqActivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqqActivityApplication.class, args);
	}

}

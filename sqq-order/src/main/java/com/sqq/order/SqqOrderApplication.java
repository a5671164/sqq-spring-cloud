package com.sqq.order;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@EnableEurekaClient
@EnableTransactionManagement /*事务*/
@SpringBootApplication(scanBasePackages = {"com.sqq.order"})
@MapperScan(basePackages = {"com.sqq.order.mapper"})
@EnableFeignClients(basePackages = "com.sqq.order.openfegin") /*fegin*/
@EnableDistributedTransaction /*分布式事务处理*/
public class SqqOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqqOrderApplication.class, args);
	}

}

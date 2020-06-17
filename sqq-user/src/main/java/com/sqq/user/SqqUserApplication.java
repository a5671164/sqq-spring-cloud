package com.sqq.user;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@EnableEurekaClient
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"com.sqq.user"})
@MapperScan(basePackages = {"com.sqq.user.mapper"})
@EnableDistributedTransaction /*分布式事务处理*/
public class SqqUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqqUserApplication.class, args);
	}

}

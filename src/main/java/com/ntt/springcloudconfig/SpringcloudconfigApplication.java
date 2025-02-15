package com.ntt.springcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconfigApplication.class, args);
	}

}

package com.message.os;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.message.os.mapper")
public class PrivateMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivateMessageApplication.class, args);
	}

}

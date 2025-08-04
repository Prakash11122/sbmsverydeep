package com.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jdbc.dto.ProductDto;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(Application.class, args);
		
		ProductDto dao = context.getBean(ProductDto.class);
		dao.getProducts().forEach(System.out::println );
	}

}

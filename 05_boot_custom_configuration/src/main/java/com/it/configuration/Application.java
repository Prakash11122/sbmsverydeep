package com.it.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.it.configuration.bean.Passenger;

@SpringBootApplication
//@PropertySource("classpath:common.properties")
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Passenger passenger = context.getBean("passenger", Passenger.class);
		System.out.println(passenger);
	}

}

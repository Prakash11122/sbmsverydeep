package com.it.pradhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.it.pradhan.listeners.BLApplicationEnvironmentPreparedEventListener;
import com.it.pradhan.listeners.BLApplicationPreparedEventListener;
import com.it.pradhan.listeners.BLApplicationReadyEventListener;
import com.it.pradhan.listeners.BLApplicationStartedEventListener;
import com.it.pradhan.listeners.BLApplicationStartingEventListenes;
import com.it.pradhan.listeners.GlobalApplicationListener;

@SpringBootApplication
public class BootListenersApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplicationBuilder(BootListenersApplication.class)
				.listeners(new BLApplicationStartingEventListenes(),
				new BLApplicationEnvironmentPreparedEventListener(),
				new BLApplicationPreparedEventListener(),
				new BLApplicationStartedEventListener(),
				new BLApplicationReadyEventListener(), 
				new GlobalApplicationListener()).build();
		
		ApplicationContext contect = springApplication.run(args);
		System.out.println("Application is running");
	}

}

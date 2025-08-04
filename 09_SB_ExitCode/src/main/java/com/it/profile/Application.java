package com.it.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.it.profile.beans.ShipmentTracker;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		ShipmentTracker shipmentTracker = context.getBean(ShipmentTracker.class);
		  
		String track = shipmentTracker.track("ac3434");
		System.out.println("status : " + track);
		System.exit(10);
	}

}

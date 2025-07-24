package com.it.pradhan.beans;

import org.springframework.stereotype.Component;

@Component
public class Bus {

	public Bus() {
		System.out.println("Bus is created");
	}

	public void init() {
		System.out.println("bus init method");
		
	}
	

}

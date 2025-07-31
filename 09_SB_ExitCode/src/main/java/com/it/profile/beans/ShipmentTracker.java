package com.it.profile.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ShipmentTracker {

	@PostConstruct
	public void init() {
		System.out.println("init()");
	}

	public String track(String referenceNo) {
		return "init-transit";
	}

	@PreDestroy
	public void close() {
		System.out.println("close()");
	}

}

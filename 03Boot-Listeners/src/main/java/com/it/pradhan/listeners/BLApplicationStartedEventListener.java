package com.it.pradhan.listeners;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

import com.it.pradhan.beans.Bus;

public class BLApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		ApplicationContext applicationContext = event.getApplicationContext();
		Bus bean = applicationContext.getBean("bus",Bus.class);
		bean.init();
		
		System.out.println("Application Started Event");
		
	}

}

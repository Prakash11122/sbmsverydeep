package com.it.pradhan.listeners;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class BLApplicationEnvironmentPreparedEventListener  implements ApplicationListener<ApplicationEnvironmentPreparedEvent>{

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		System.out.println("Application Environment Prepared Event : "+ event.getEnvironment().getClass().getName());
		
	}


	
	

}

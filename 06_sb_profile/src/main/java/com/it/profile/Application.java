package com.it.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.it.profile.bean.Passport;

@SpringBootApplication
@Import({DevConfig.class, TestConfig.class})
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		Passport passport = context.getBean("passport", Passport.class);
		System.out.println(passport);
	}

}

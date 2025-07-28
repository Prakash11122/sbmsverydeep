package com.it.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.it.profile.bean.CommonYamlPropertySourceFactory;

@Configuration
@Profile("test")
@PropertySource(value = "classpath:common-test.yml", factory = CommonYamlPropertySourceFactory.class)
public class TestConfig {

}

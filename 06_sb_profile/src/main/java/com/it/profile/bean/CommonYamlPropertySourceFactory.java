 package com.it.profile.bean;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

public class CommonYamlPropertySourceFactory implements PropertySourceFactory{

	@Override
	public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
		
		YamlPropertiesFactoryBean  yamlPropertiesFactoryBean = null;
		Properties props = null;
		
		yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
		yamlPropertiesFactoryBean.setResources(resource.getResource());
		
		props = yamlPropertiesFactoryBean.getObject();
		
		return new PropertiesPropertySource("common", props);
	}

}

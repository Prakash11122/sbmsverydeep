package com.it.configuration;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

import jakarta.annotation.PostConstruct;

@Configuration
public class YamlConfigLoader implements EnvironmentAware {

    private ConfigurableEnvironment environment;

    @Override
    public void setEnvironment(org.springframework.core.env.Environment environment) {
        this.environment = (ConfigurableEnvironment) environment;
    }

    @PostConstruct
    public void loadYaml() throws IOException {
        YamlPropertySourceLoader loader = new YamlPropertySourceLoader();
        List<PropertySource<?>> yamlProperties = loader.load("common", new ClassPathResource("common.yml"));

        for (PropertySource<?> propertySource : yamlProperties) {
            environment.getPropertySources().addLast(propertySource);
        }
    }

}

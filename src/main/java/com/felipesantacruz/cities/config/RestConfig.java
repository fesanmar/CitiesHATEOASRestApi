package com.felipesantacruz.cities.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy.RepositoryDetectionStrategies;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Component
public class RestConfig implements RepositoryRestConfigurer 
{
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors)
	{
		// Default is not needed. Used here as an example
		config.setRepositoryDetectionStrategy(RepositoryDetectionStrategies.DEFAULT);
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
	}
	
}

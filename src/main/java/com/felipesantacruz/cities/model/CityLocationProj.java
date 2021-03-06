package com.felipesantacruz.cities.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "cityLocation", types = { City.class })
public interface CityLocationProj
{
	@Value("#{target.id}")
	long getId();
	
	String getName();
	
	@Value("#{target.lat + ',' + target.lng}")
	String getLocation();
	
	@Value("#{target.getCountry().getName()}")
	String getCountry();
}

package com.felipesantacruz.cities.model.proj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.felipesantacruz.cities.model.City;

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

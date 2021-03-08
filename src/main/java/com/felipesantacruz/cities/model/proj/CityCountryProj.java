package com.felipesantacruz.cities.model.proj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.felipesantacruz.cities.model.City;

@Projection(name = "cityCountry", types = { City.class })
public interface CityCountryProj
{
	String getName();
	
	@Value("#{target.getCountry().getName()}")
	String getCountry();
}

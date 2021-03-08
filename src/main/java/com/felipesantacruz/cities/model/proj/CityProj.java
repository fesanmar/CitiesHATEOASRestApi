package com.felipesantacruz.cities.model.proj;

import org.springframework.data.rest.core.config.Projection;

import com.felipesantacruz.cities.model.City;

@Projection(name = "cityNoLocation", types = { City.class })
public interface CityProj
{
	String getName();
}

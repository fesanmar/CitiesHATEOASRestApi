package com.felipesantacruz.cities.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "cityNoLocation", types = { City.class })
public interface CityProj
{
	String getName();
}

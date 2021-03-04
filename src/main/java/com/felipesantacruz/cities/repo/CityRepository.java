package com.felipesantacruz.cities.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.felipesantacruz.cities.model.City;

@RepositoryRestResource(path = "cities", collectionResourceRel = "cities")
public interface CityRepository extends JpaRepository<City, Long>
{

}

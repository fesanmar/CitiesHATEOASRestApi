package com.felipesantacruz.cities.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.felipesantacruz.cities.model.City;

@RepositoryRestResource(path = "cities", collectionResourceRel = "cities")
public interface CityRepository extends JpaRepository<City, Long>
{
	@RestResource(path = "nameStartsWith", rel = "nameStartsWith")
	Page<City> findByNameStartsWith(@Param("name") String st, Pageable p);
}

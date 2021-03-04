package com.felipesantacruz.cities.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.felipesantacruz.cities.model.Country;

@RepositoryRestResource(exported = false)
public interface CountryRepository extends JpaRepository<Country, Long>
{

}

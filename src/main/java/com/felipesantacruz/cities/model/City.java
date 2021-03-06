package com.felipesantacruz.cities.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class City
{
	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String lat;

	private String lng;

	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
}

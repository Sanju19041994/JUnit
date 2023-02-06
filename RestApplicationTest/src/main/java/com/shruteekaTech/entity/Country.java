package com.shruteekaTech.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {

	@Id
	private int id;
	
	private String countryName;
	
	private String cityName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(int id, String countryName, String cityName) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + ", cityName=" + cityName + "]";
	}
	
	
	
}

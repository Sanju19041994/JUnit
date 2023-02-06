package com.shruteekaTech.service;

import java.util.List;

import com.shruteekaTech.entity.Country;

public interface CountryService {

	public Country getCountryById(Integer id);
	
	public List<Country> getAllCountry();
	
	public Country getCountryByName(String countryName);
	
	public Country addCountry(Country country);
	
	public Country updateCountry(Country country,Integer id);
	
	public void deleteCountry(Country country);
	
}

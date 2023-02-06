package com.shruteekaTech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shruteekaTech.entity.Country;
import com.shruteekaTech.service.CountryService;
import com.shruteekaTech.utils.ResourceNotFoundException;
import com.shruteekaTech.utils.ResponseApi;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Country> getCountryById(@PathVariable Integer id){
		Country countryById = this.countryService.getCountryById(id);
		if(countryById != null) {
			return new ResponseEntity<Country>(countryById,HttpStatus.FOUND);
		}else {
			throw new ResourceNotFoundException("Country", "Country Id");
		}
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Country>> getAllCountry(){
		List<Country> allCountry = this.countryService.getAllCountry();
		
		if(allCountry !=  null) {
			return new ResponseEntity<List<Country>>(allCountry,HttpStatus.FOUND);
		}else {
			throw new ResourceNotFoundException("Country", "Country Id");
		}
		
	}
	
	
	@GetMapping("/name/{countryName}")
	public ResponseEntity<Country> getCountryByName(@PathVariable String countryName){
		Country countryByName = this.countryService.getCountryByName(countryName);
		 if(countryByName != null) {
			 return new ResponseEntity<Country>(countryByName,HttpStatus.FOUND);
		 }else {
				throw new ResourceNotFoundException("Country", "Country Id");
		}
	}
	
	@PostMapping("/")
	public ResponseEntity<Country> addCountry(@RequestBody Country country){
		Country addCountry = this.countryService.addCountry(country);
		return new ResponseEntity<Country>(addCountry,HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Country> updateCountry
	(@RequestBody Country country,@PathVariable Integer id)
	{	
		 Country updateCountry = this.countryService.updateCountry(country, id);
		if(updateCountry != null) {
			return new ResponseEntity<Country>(updateCountry,HttpStatus.OK);
		 }else {
				throw new ResourceNotFoundException("Country", "Country Id");
		}
	}
	
	
	
}

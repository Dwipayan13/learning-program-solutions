package com.cognizant.country.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.country.entity.Country;
import com.cognizant.country.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryService.getCountry(code);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.addCountry(country);
    }

    
    @GetMapping("/hql/{name}")
    public List<Country> getCountriesByNameHQL(@PathVariable String name) {
        return countryService.getCountriesByNameHQL(name);
    }

  
    @GetMapping("/native/{name}")
    public List<Country> getCountriesByNameNative(@PathVariable String name) {
        return countryService.getCountriesByNameNative(name);
    }
}

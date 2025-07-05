package com.cognizant.country.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.country.entity.Country;
import com.cognizant.country.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    @Override
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> getCountriesByNameHQL(String name) {
        return countryRepository.findByNameHQL(name);
    }

    @Override
    public List<Country> getCountriesByNameNative(String name) {
        return countryRepository.findByNameNative(name);
    }
}

package com.cognizant.country.service;

import java.util.List;
import com.cognizant.country.entity.Country;

public interface CountryService {
    List<Country> getAllCountries();
    Country getCountry(String code);
    Country addCountry(Country country);

    // ✅ Add these two methods
    List<Country> getCountriesByNameHQL(String name);
    List<Country> getCountriesByNameNative(String name);
}

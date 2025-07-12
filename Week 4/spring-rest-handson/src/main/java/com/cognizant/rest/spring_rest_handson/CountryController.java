package com.cognizant.rest.spring_rest_handson;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class CountryController {

    private static Map<String, Country> countryMap = new HashMap<>();

    static {
        countryMap.put("IN", new Country("IN", "India"));
        countryMap.put("US", new Country("US", "United States"));
        countryMap.put("CN", new Country("CN", "China"));
    }

    @GetMapping("/country/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        return countryMap.get(code.toUpperCase());
    }
}

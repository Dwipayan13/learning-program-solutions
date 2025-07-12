package com.cognizant.rest.spring_rest_handson.controller;

import com.cognizant.rest.spring_rest_handson.model.Country;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/country")
public class CountryController {

    @GetMapping
    public Country getCountry() {
        return new Country("IN", "India");
    }

    @GetMapping("/{code}")
    public Country getCountryByCode(@PathVariable String code) {
        Country country = new Country();
        country.setCode(code.toUpperCase());

        switch (code.toUpperCase()) {
            case "IN":
                country.setName("India");
                break;
            case "US":
                country.setName("United States");
                break;
            case "JP":
                country.setName("Japan");
                break;
            default:
                country.setName("Unknown");
        }

        return country;
    }
}

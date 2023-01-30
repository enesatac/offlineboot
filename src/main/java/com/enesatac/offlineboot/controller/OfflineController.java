package com.enesatac.offlineboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.enesatac.offlineboot.model.Airport;
import com.enesatac.offlineboot.model.Flight;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class OfflineController {
    
    @GetMapping("/airport")
    public List<Airport> getAirports() {

        List<Airport> ports = new ArrayList<>();
        ports.add(new Airport("İstanbul Havalimanı", "IST"));
        ports.add(new Airport("Sabiha Gökçen Havalimanı", "SAW"));

        return ports;
    }

    @PostMapping("/flight")
    public Flight saveFlight(@RequestBody Flight flight) throws JsonProcessingException {
        System.out.println("New flight : " + new ObjectMapper().writeValueAsString(flight));
        return flight;
    }

}

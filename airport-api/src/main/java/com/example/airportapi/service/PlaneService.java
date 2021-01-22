package com.example.airportapi.service;

import com.example.airportcore.model.PlaneDto;
import org.springframework.stereotype.Service;

@Service
public class PlaneService {

    public PlaneDto getPlane(int number){
        return new PlaneDto("Jet Plane", number);
    }
}

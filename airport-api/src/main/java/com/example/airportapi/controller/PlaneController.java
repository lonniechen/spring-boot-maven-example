package com.example.airportapi.controller;

import com.example.airportapi.service.PlaneService;
import com.example.airportcore.model.PlaneDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/planes")
public class PlaneController {

    @Autowired
    PlaneService planService;

    @GetMapping(value = "/")
    public ResponseEntity<PlaneDto> getPlane(){
        PlaneDto planeDto = planService.getPlane();
        return new ResponseEntity<>(planeDto, HttpStatus.OK);
    }
}

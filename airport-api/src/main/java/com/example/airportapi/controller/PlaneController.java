package com.example.airportapi.controller;

import com.example.airportapi.service.PlaneService;
import com.example.airportcore.model.PlaneDto;
import com.example.common.utils.Multiplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/planes")
public class PlaneController {

    @Autowired
    PlaneService planeService;

    @GetMapping()
    public ResponseEntity<PlaneDto> getPlane(@RequestParam String number) {
        int enginesCount = Multiplier.multiplyBy10(Integer.parseInt(number));
        PlaneDto planeDto = planeService.getPlane(enginesCount);
        return new ResponseEntity<>(planeDto, HttpStatus.OK);
    }
}

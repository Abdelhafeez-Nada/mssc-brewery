package org.abdelhafeez.msscbrewery.web.controller;

import java.util.UUID;

import org.abdelhafeez.msscbrewery.service.BeerService;
import org.abdelhafeez.msscbrewery.web.dto.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/beer")
@AllArgsConstructor
public class BeerController {

    private final BeerService beerService;

    // 4bd55e59-c9c9-4494-b9b1-dbd9fd34807e
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> findById(@PathVariable UUID beerId) {
        return new ResponseEntity<BeerDto>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
}

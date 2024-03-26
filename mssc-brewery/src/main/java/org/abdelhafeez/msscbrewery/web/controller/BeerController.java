package org.abdelhafeez.msscbrewery.web.controller;

import java.util.UUID;

import org.abdelhafeez.msscbrewery.service.BeerService;
import org.abdelhafeez.msscbrewery.web.dto.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @PostMapping("")
    public ResponseEntity<Void> createNewBeer(@RequestBody BeerDto beerDto) {
        BeerDto saved = beerService.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/beer/" + saved.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/api/v1/beer")
    public ResponseEntity<Void> updateBeer(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {
        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID beerId) {
        beerService.deleteById(beerId);
    }

}

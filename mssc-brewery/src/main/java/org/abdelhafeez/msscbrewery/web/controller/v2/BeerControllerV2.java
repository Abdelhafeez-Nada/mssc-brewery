package org.abdelhafeez.msscbrewery.web.controller.v2;

import java.util.UUID;
import org.abdelhafeez.msscbrewery.service.v2.BeerServiceV2;
import org.abdelhafeez.msscbrewery.web.dto.v2.BeerDtoV2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v2/beer")
@AllArgsConstructor
public class BeerControllerV2 {

    private final BeerServiceV2 beerServiceV2;

    // 4bd55e59-c9c9-4494-b9b1-dbd9fd34807e
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> findById(@PathVariable UUID beerId) {
        return new ResponseEntity<BeerDtoV2>(beerServiceV2.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Void> createNewBeer(@RequestBody BeerDtoV2 beerDto) {
        BeerDtoV2 saved = beerServiceV2.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v2/beer/" + saved.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("")
    public ResponseEntity<Void> updateBeer(@PathVariable UUID beerId, @RequestBody BeerDtoV2 beerDtoV2) {
        beerServiceV2.updateBeer(beerId, beerDtoV2);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID beerId) {
        beerServiceV2.deleteById(beerId);
    }
}

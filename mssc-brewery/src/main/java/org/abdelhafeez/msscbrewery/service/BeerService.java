package org.abdelhafeez.msscbrewery.service;

import java.util.UUID;

import org.abdelhafeez.msscbrewery.web.dto.BeerDto;

public interface BeerService {

    public BeerDto getBeerById(UUID id);

    public BeerDto saveNewBeer(BeerDto beerDto);

    public void updateBeer(UUID id, BeerDto beerDto);

    public void deleteById(UUID id);
}

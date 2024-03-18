package org.abdelhafeez.msscbrewery.service;

import java.util.UUID;

import org.abdelhafeez.msscbrewery.web.dto.BeerDto;

public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder().id(UUID.randomUUID()).name("Galaxy Cat").style("Pale Ale").build();
    }

}

package org.abdelhafeez.msscbrewery.service.v2;

import java.util.UUID;

import org.abdelhafeez.msscbrewery.web.dto.v2.BeerDtoV2;
import org.abdelhafeez.msscbrewery.web.dto.v2.BeerStyleEnum;
import org.springframework.stereotype.Service;

@Service
public class BeerServiceV2Impl implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID id) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).name("Galaxy Cat").style(BeerStyleEnum.ALE).build();

    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID id, BeerDtoV2 beerDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateBeer'");
    }

    @Override
    public void deleteById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

}

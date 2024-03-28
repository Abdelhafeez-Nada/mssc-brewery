package org.abdelhafeez.msscbrewery.service.v2;

import java.util.UUID;
import org.abdelhafeez.msscbrewery.web.dto.v2.BeerDtoV2;

public interface BeerServiceV2 {
    public BeerDtoV2 getBeerById(UUID id);

    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    public void updateBeer(UUID id, BeerDtoV2 beerDto);

    public void deleteById(UUID id);
}

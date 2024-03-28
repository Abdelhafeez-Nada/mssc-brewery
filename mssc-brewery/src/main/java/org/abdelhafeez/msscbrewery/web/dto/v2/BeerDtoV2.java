package org.abdelhafeez.msscbrewery.web.dto.v2;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BeerDtoV2 {

    private UUID id;
    private String name;
    private BeerStyleEnum style;
    private Long upc;
}

package org.abdelhafeez.msscbrewery.web.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BeerDto {

    private UUID id;
    private String name;
    private String style;
    private Long upc;
}

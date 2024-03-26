package org.abdelhafeez.msscbrewery.service;

import java.util.UUID;

import org.abdelhafeez.msscbrewery.web.dto.CustomerDto;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("john").build();
    }

}

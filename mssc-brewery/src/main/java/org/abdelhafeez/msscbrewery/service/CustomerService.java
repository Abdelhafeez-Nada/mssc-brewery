package org.abdelhafeez.msscbrewery.service;

import java.util.UUID;

import org.abdelhafeez.msscbrewery.web.dto.CustomerDto;

public interface CustomerService {

    public CustomerDto getCustomerById(UUID id);
}

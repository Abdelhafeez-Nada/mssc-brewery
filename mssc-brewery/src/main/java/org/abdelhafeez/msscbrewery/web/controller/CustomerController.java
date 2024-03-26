package org.abdelhafeez.msscbrewery.web.controller;

import java.util.UUID;

import org.abdelhafeez.msscbrewery.service.CustomerService;
import org.abdelhafeez.msscbrewery.web.dto.CustomerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RequestMapping("api/v1/customer")
@RestController
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID id) {
        return new ResponseEntity<CustomerDto>(customerService.getCustomerById(id), HttpStatus.OK);
    }
}

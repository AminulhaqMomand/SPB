package com.halalpza.spb.controller;

import com.halalpza.spb.model.Customer;
import com.halalpza.spb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    @PostMapping("/customer")
    Customer newCustomer(@RequestBody Customer newCustomer){
        return customerRepository.save(newCustomer);
    }
    @GetMapping("/customers")
    List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
}

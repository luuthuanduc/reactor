package com.aimatrix.nonreactive.controller;

import com.aimatrix.nonreactive.domain.Coffee;
import com.aimatrix.nonreactive.service.CoffeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {
    private final CoffeeService service;

    public CoffeeController(CoffeeService service) {
        this.service = service;
    }

    @GetMapping
    Iterable<Coffee> all() {
        return service.getAllCoffees();
    }

    @GetMapping("/{id}")
    Optional<Coffee> byId(@PathVariable String id) {
        return service.getCoffeeById(id);
    }

}

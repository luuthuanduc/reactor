package com.aimatrix.nonreactive.service;

import com.aimatrix.nonreactive.domain.Coffee;
import com.aimatrix.nonreactive.repository.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CoffeeService {
    private final CoffeeRepository repo;

    public CoffeeService(CoffeeRepository repo) {
        this.repo = repo;
    }

    public Iterable<Coffee> getAllCoffees() {
        return repo.findAll();
    }

    public Optional<Coffee> getCoffeeById(String id) {
        return repo.findById(id);
    }
}

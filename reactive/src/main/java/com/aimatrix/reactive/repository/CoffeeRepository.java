package com.aimatrix.reactive.repository;

import com.aimatrix.reactive.domain.Coffee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CoffeeRepository extends ReactiveCrudRepository<Coffee, String> {
}

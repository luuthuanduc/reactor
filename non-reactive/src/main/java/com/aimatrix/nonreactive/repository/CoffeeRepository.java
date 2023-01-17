package com.aimatrix.nonreactive.repository;

import com.aimatrix.nonreactive.domain.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}

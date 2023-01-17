package com.aimatrix.reactive.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeOrder {
    private String coffeeId;
    private Instant whenOrdered;
}

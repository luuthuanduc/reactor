package com.aimatrix.reactive.component;

import com.aimatrix.reactive.domain.Coffee;
import com.aimatrix.reactive.repository.CoffeeRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import javax.annotation.PostConstruct;

@Component
public class DataLoader {
    private final CoffeeRepository repo;

    public DataLoader(CoffeeRepository repo) {
        this.repo = repo;
    }

    @PostConstruct
    private void load() {
        repo.deleteAll().thenMany(
            Flux.just("Kaldi's Coffee", "Philz Coffee", "Blue Bottle Coffee")
              .map(Coffee::new)
              .flatMap(repo::save))
          .thenMany(repo.findAll())
          .subscribe(System.out::println);
    }
}

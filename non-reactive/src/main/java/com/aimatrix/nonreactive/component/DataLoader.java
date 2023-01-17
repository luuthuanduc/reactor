package com.aimatrix.nonreactive.component;

import com.aimatrix.nonreactive.domain.Coffee;
import com.aimatrix.nonreactive.repository.CoffeeRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.stream.Stream;

@Component
public class DataLoader {
    private final CoffeeRepository repo;

    public DataLoader(CoffeeRepository repo) {
        this.repo = repo;
    }

    @PostConstruct
    private void load() {
        repo.deleteAll();

        Stream.of("Kaldi's Coffee", "Philz Coffee", "Blue Bottle Coffee")
          .map(Coffee::new)
          .forEach(repo::save);

        repo.findAll().forEach(System.out::println);
    }
}

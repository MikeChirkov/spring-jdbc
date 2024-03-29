package ru.netology.springjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springjdbc.repository.JdbcRepository;

import java.util.List;

@RestController
public class JdbcController {

    private final JdbcRepository jdbcRepository;

    public JdbcController(JdbcRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam String name) {
        return jdbcRepository.getProductName(name);
    }
}
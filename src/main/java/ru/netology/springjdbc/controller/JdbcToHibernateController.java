package ru.netology.springjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springjdbc.repository.JdbcToHibernateRepository;

import java.util.List;

@RestController
public class JdbcToHibernateController {

    private final JdbcToHibernateRepository jdbcRepository;

    public JdbcToHibernateController(JdbcToHibernateRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam String name) {
        return jdbcRepository.getProductName(name);
    }
}
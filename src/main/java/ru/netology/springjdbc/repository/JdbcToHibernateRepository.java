package ru.netology.springjdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcToHibernateRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getProductName(String name) {
        return entityManager.createQuery("select o.productName " +
                        "from Customer c " +
                        "left join Order o " +
                        "on c.id = o.customer.id " +
                        "where lower(c.name) = lower(:name)", String.class)
                .setParameter("name", name)
                .getResultList();
    }
}

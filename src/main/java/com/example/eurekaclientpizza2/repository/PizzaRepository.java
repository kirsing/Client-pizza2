package com.example.eurekaclientpizza2.repository;

import com.example.eurekaclientpizza2.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}

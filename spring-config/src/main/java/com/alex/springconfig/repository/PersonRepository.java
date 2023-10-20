package com.alex.springconfig.repository;

import com.alex.springconfig.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
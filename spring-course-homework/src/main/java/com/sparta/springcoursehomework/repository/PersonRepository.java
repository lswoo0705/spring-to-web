package com.sparta.springcoursehomework.repository;

import com.sparta.springcoursehomework.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

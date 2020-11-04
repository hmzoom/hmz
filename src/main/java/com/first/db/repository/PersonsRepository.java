package com.first.db.repository;

import com.first.db.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonsRepository extends JpaRepository<Person, Integer> {
}

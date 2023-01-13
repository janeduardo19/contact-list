package com.project.contactList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.contactList.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}

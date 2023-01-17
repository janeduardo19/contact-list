package com.project.contactList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.contactList.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}

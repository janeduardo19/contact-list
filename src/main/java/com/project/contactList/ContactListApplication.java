package com.project.contactList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.project.contactList.entities")
@EnableJpaRepositories("com.project.contactList.repositories")
public class ContactListApplication {
	public static void main(String[] args) {
		SpringApplication.run(ContactListApplication.class, args);
	}
}

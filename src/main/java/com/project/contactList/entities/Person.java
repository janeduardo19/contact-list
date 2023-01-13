package com.project.contactList.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private long person_id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String birthday;
	
	@JoinColumn
	@OneToMany(cascade = CascadeType.ALL )
	private List<Address> addresses;
	
	public Person() {
		super();
	}

	public Person(String name, String birthday, List<Address> addresses) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.addresses = addresses;
	}

	public long getPersonId() {
		return person_id;
	}

	public void setPersonId(long person_id) {
		this.person_id = person_id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}
	
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
}

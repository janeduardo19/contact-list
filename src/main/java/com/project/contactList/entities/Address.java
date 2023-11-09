package com.project.contactList.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private long address_id;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String cep;
	
	@Column(nullable = false)
	private String number;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false)
	private Boolean mainAddress;

	public Address() {
		super();
	}

	public Address(long address_id, String address, String cep, String number, String city) {
		super();
		this.address_id = address_id;
		this.address = address;
		this.cep = cep;
		this.number = number;
		this.city = city;
	}
}

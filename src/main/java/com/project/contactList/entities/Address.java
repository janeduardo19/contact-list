package com.project.contactList.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
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

	public long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getMainAddress() {
		return mainAddress;
	}

	public void setMainAddress(Boolean mainAddress) {
		this.mainAddress = mainAddress;
	}
}

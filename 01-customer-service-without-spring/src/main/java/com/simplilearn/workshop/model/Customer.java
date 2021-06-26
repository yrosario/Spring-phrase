package com.simplilearn.workshop.model;

public class Customer {
	
	private Long id;
	private String name;
	private String email;
	private String phone;
	
	public Customer() {
		super();
	}

	public Customer(Long id, String name, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return String.format("Customer [id=%s, name=%s, email=%s, phone=%s]", id, name, email, phone);
	}


	
	
}

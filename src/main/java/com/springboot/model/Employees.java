package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employees_table")
public class Employees {
	//test changes in 2 crud
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String  name;
	
	@Column(name = "email")
	private String   email;
	
	@Column(name = "password")
	private String    password;
	
	@Column(name = "dob")
	private String    dob;
	
	@Column(name = "qualification")
	private String   qualification;
	
	@Column(name = "domain")
	private String    domain;
	
	@Column(name = "experiance")
	private String    experiance;
	
	@Column(name = "contact")
	private String    contact;
	
	@Column(name = "address")
	private String   address;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}
	public Employees(int id, String name, String email, String password, String dob, String qualification, String domain,
			String experiance, String contact, String address, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.qualification = qualification;
		this.domain = domain;
		this.experiance = experiance;
		this.contact = contact;
		this.address = address;
	}
	
	
	public Employees(int id, String name, String email, String password, String dob, String qualification, String domain,
			String experiance, String contact, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.qualification = qualification;
		this.domain = domain;
		this.experiance = experiance;
		this.contact = contact;
		this.address = address;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getExperiance() {
		return experiance;
	}

	public void setExperiance(String experiance) {
		this.experiance = experiance;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}

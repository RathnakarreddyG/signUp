package com.springboot.thyem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "user_details")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotEmpty(message="name cant be null")
    @Size(min=1,message="name cant be null")
	private String first_name;
	@NotEmpty(message="name cant be null")
    @Size(min=1,message="name cant be null")
	private String last_name;
	@NotEmpty(message="name cant be null")
	private String role;
	@NotEmpty(message="name cant be null")
	private String gender;
	@NotEmpty(message="name cant be null")
    @Email
	private String email;
	@NotEmpty(message="name cant be null")
    @Size(min=10,max = 10,message ="name cant be null")
	private String phone_no;
	@NotEmpty(message="name cant be null")
    @Size(min=1,message="name cant be null")
	private String address;
	@NotEmpty(message="name cant be null")
    @Size(min=1,message="name cant be null")
	private String state;
	@NotEmpty(message="name cant be null")
    @Size(min=1,message="name cant be null")
	private String dob;
	@NotEmpty(message="name cant be null")
	private String languages;

	private byte[] image;

	public User() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}

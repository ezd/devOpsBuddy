package com.devopsbuddy.web.domain.frontend;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

public class BasicAccountPayload implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Email
	@NotNull
	private String email;
	@NotNull
	private String userName;
	@NotNull
	private String password;
	@NotNull
	private String confirmPassword;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String description;
	@NotNull
	private String phoneNumber;
	@NotNull
	private String country;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BasicAccountPayload other = (BasicAccountPayload) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BasicAccountPayload [email=" + email + ", userName=" + userName + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", description=" + description + ", phoneNumber=" + phoneNumber + ", country=" + country + "]";
	}
	
	
	

}

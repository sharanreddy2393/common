package com.HallBooking.common.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="USER_INFORMATION")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserInfromation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USERID")
	private int userId;
	
	@Column(name="F_NAME")
	private String fName;
	
	@Column(name="L_NAME")
	private String lName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONENUMBER")
	private String phoneNumber;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="STATUS")
	private String activeStatus;
	
	@Column(name="PROFILE_PIC")
	private String profilePicture;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

}

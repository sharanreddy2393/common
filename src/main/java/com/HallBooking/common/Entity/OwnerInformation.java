package com.HallBooking.common.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "OWNER_INFORMATION")
public class OwnerInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OWNER_ID")
	private int ownerId;

	@Column(name = "F_NAME")
	private String fName;

	@Column(name = "L_NAME")
	private String lName;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "ADHAR_CARD")
	private String adharNumber;

	@Column(name = "PHONENUMBER")
	private String phoneNumber;

	@Column(name = "PSWRD")
	private String password;

	@Column(name = "STATUS")
	private String activeStatus;

	@Column(name = "PROFILE_PIC")
	private String profilePicture;

	@OneToMany(mappedBy = "ownerInformation", cascade = CascadeType.ALL)
	private List<HallInformation> hallInformation;

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
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

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public List<HallInformation> getHallInformation() {
		return hallInformation;
	}

	public void setHallInformation(List<HallInformation> hallInformation) {
		this.hallInformation = hallInformation;
	}

}

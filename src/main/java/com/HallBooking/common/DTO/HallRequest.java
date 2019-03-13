package com.HallBooking.common.DTO;

import java.math.BigDecimal;

import javax.persistence.Column;

public class HallRequest {

	private String hallName;

	private String muncipalRegistration;

	private String hallDescription;

	private String locality;

	private String city;

	private String landmark;

	private String state;

	private String country;

	private String pincode;

	private BigDecimal advanceAmount;

	private BigDecimal fullAmount;

	private int hallCapacity;

	private String hallAvailability;

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public String getMuncipalRegistration() {
		return muncipalRegistration;
	}

	public void setMuncipalRegistration(String muncipalRegistration) {
		this.muncipalRegistration = muncipalRegistration;
	}

	public String getHallDescription() {
		return hallDescription;
	}

	public void setHallDescription(String hallDescription) {
		this.hallDescription = hallDescription;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public BigDecimal getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(BigDecimal advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public BigDecimal getFullAmount() {
		return fullAmount;
	}

	public void setFullAmount(BigDecimal fullAmount) {
		this.fullAmount = fullAmount;
	}

	public int getHallCapacity() {
		return hallCapacity;
	}

	public void setHallCapacity(int hallCapacity) {
		this.hallCapacity = hallCapacity;
	}

	public String getHallAvailability() {
		return hallAvailability;
	}

	public void setHallAvailability(String hallAvailability) {
		this.hallAvailability = hallAvailability;
	}

	
}

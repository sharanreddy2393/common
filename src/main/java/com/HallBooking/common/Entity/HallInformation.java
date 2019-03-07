package com.HallBooking.common.Entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "HALL_INFORMATION")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class HallInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="HALLID")
	private int hallId;

	@Column(name = "HALL_NAME")
	private String hallName;

	@Column(name = "MUNCIPAL_REGISTRATION")
	private String muncipalRegistration;

	@Column(name = "HALL_DESCRIPTION")
	private String hallDescription;

	@Column(name = "ADR_LOCALITY")
	private String locality;

	@Column(name = "ADR_CITY")
	private String city;

	@Column(name = "ADR_LANDMARK")
	private String landmark;

	@Column(name = "ADR_STATE")
	private String state;

	@Column(name = "ADR_COUNTRY")
	private String country;

	@Column(name = "ADR_PINCODE")
	private String pincode;

	@Column(name = "ADVANCE_AMT")
	private BigDecimal advanceAmount;

	@Column(name = "FULL_AMT")
	private BigDecimal fullAmount;

	@Column(name = "HALL_CAPACITY")
	private int hallCapacity;

	@Column(name="HALL_AVAILABILITY")
	private String hallAvailability;
	
	public int getHallId() {
		return hallId;
	}

	public void setHallId(int hallId) {
		this.hallId = hallId;
	}

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

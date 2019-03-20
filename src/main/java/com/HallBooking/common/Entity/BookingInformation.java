package com.HallBooking.common.Entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="booking_information")
public class BookingInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookingid")
	private String bookingId;
	
	@ManyToOne
	@JoinColumn(name="USERID",nullable=false)
	private UserInfromation userId;
	
	@OneToOne
	@JoinColumn(name="HALLID",nullable=false)
	private HallInformation hallId;
	
	@Column(name="fromdate")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date fromDate;
	
	@Column(name="todate")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date toDate;
	
	@Column(name="num_days")
	private int numOfDays;
	
	@Column(name="advn_amt_paid")
	private BigDecimal advanceAmount;

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getNumOfDays() {
		return numOfDays;
	}

	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}

	public BigDecimal getAdvanceAmount() {
		return advanceAmount;
	}

	public void setAdvanceAmount(BigDecimal advanceAmount) {
		this.advanceAmount = advanceAmount;
	}

	public UserInfromation getUserId() {
		return userId;
	}

	public void setUserId(UserInfromation userId) {
		this.userId = userId;
	}

	public HallInformation getHallId() {
		return hallId;
	}

	public void setHallId(HallInformation hallId) {
		this.hallId = hallId;
	} 
	
	
}

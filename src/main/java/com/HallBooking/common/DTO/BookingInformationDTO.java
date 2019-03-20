package com.HallBooking.common.DTO;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class BookingInformationDTO {

	private int userId;
	private int hallId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
	@JsonSerialize
	@JsonDeserialize
	private Date fromDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
	@JsonSerialize
	@JsonDeserialize
	private Date toDate;
	private int numOfDays;
	private BigDecimal advanceAmount;
		
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
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

}

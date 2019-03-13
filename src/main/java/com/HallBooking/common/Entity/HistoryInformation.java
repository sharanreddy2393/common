package com.HallBooking.common.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="history_information")
public class HistoryInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="hisid")
	private int historyId;
	
	@Column(name="email")
	private String emailId;
	
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Column(name="muncipal_Num")
	private String hallMuncipalNum;
	
	@Column(name="fromdate")
	private Date fromDate;
	
	@Column(name="todate")
	private Date toDate;
	
	@Column(name="num_days")
	private int numOfDays;
	
	@Column(name="advn_amt")
	private Date createTimeStramp;
	
	public int getHistoryId() {
		return historyId;
	}
	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHallMuncipalNum() {
		return hallMuncipalNum;
	}
	public void setHallMuncipalNum(String hallMuncipalNum) {
		this.hallMuncipalNum = hallMuncipalNum;
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
	public Date getCreateTimeStramp() {
		return createTimeStramp;
	}
	public void setCreateTimeStramp(Date createTimeStramp) {
		this.createTimeStramp = createTimeStramp;
	}
	
	
}

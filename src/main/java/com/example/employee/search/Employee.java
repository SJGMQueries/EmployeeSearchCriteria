package com.example.employee.search;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Employee {
	private int employeeId;
	private String employeeName;
	private String dob;
	private String postalCode;
	private String houseNum;
	private String idType;
	private String idNum;
	private String mobileNoBusiness;
	private String mobileNoPrivate;
	private String iban;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getMobileNoBusiness() {
		return mobileNoBusiness;
	}

	public void setMobileNoBusiness(String mobileNoBusiness) {
		this.mobileNoBusiness = mobileNoBusiness;
	}

	public String getMobileNoPrivate() {
		return mobileNoPrivate;
	}

	public void setMobileNoPrivate(String mobileNoPrivate) {
		this.mobileNoPrivate = mobileNoPrivate;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Employee(int employeeId, String employeeName, String dob,
			String postalCode, String houseNum, String idType, String idNum,
			String mobileNoBusiness, String mobileNoPrivate, String iban) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dob = dob;
		this.postalCode = postalCode;
		this.houseNum = houseNum;
		this.idType = idType;
		this.idNum = idNum;
		this.mobileNoBusiness = mobileNoBusiness;
		this.mobileNoPrivate = mobileNoPrivate;
		this.iban = iban;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", dob=" + dob + ", postalCode=" + postalCode
				+ ", houseNum=" + houseNum + ", idType=" + idType + ", idNum="
				+ idNum + ", mobileNoBusiness=" + mobileNoBusiness
				+ ", mobileNoPrivate=" + mobileNoPrivate + ", iban=" + iban
				+ "]";
	}

}

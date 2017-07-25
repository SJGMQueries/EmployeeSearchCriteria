package com.example.employee.search;


public class SearchResponse {
	private Employee employee;
	private String message;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SearchResponse [employee=" + employee + ", message=" + message
				+ "]";
	}

}

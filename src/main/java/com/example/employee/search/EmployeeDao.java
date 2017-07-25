package com.example.employee.search;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(11, "Basanta", "15-02-1993", "code1", "hn1",
				"Pancard", "num1", "12345", "54321", "iban1"));
		employees.add(new Employee(18, "Santosh", "15-02-1993", "code2", "hn2",
				"Pancard1", "num1", "182345", "543921", "iban2"));
		employees.add(new Employee(17, "Rakesh", "15-02-1991", "code0", "hn12",
				"Pancard", "num1", "12345", "54321", "iban1"));
		employees.add(new Employee(11, "Sagar", "15-02-1993", "code12",
				"hn122", "Pan1card", "num122", "12345", "5432221", "iban21"));
		employees.add(new Employee(17, "Basanta", "11-07-1993", "code1",
				"housen1", "Pancard7", "num100", "123405", "504321", "iban1"));
		return employees;

	}
}

package com.example.employee.search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

@Path("/jsonServices")
public class JerseyRestService {

	List<Employee> employees = EmployeeDao.getEmployees();
	List<Employee> emps = new ArrayList<>();

	@Path("/search")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@POST
	public String getUniqueEmployee(Employee employee)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> emps = null;
		SearchResponse response = new SearchResponse();
		emps = search(employee);
		if (emps.size() == 0 || emps.size() > 1) {
			response.setMessage("No Data Found");
			response.setEmployee(null);
		} else {
			response.setMessage("Success");
			response.setEmployee(emps.get(0));
		}
		System.out.println(mapper.writeValueAsString(response));
		return mapper.writeValueAsString(response);
	}

	private List<Employee> search(Employee employee) {
		for (Employee e : employees) {
			if (e.getEmployeeId() == employee.getEmployeeId()
					|| e.getDob().equals(employee.getDob())) {
				emps.add(e);
			}
			if (emps.size() > 1) {
				emps.clear();
				if (e.getIdNum().equals(employee.getIdNum())
						|| e.getDob().equals(employee.getDob())) {
					emps.add(e);
				}
			}
			if (emps.size() > 1) {
				emps.clear();
				if (e.getEmployeeId() == employee.getEmployeeId()
						|| e.getEmployeeName().equals(
								employee.getEmployeeName())
						|| e.getIban().equals(employee.getIban())
						|| e.getPostalCode().equals(employee.getPostalCode())) {
					emps.add(e);
				}
			}
		}
		return emps;
	}

}

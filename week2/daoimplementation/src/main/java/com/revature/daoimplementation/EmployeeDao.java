package com.revature.daoimplementation;

import java.util.List;

public interface EmployeeDao {
	public void getAllEmployees();
	public Employee01 getEmployee(Employee01 emp);
	public void updateEmployee(Employee01 emp);
	public void deleteEmployee(Employee01 emp);
	public void createEmployee(Employee01 emp);
	

}

package com.revature.employeeDao;

public interface EmployeeDao {
	boolean login();
	boolean newReq();
	void pendingReq();
	void resolvedReq();
	void viewInfo();
	void updateInfo();
	

}

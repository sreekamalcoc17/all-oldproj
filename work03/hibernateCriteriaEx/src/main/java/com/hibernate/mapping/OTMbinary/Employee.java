package com.hibernate.mapping.OTMbinary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_BI")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_ID")
	private long id;
	@Column(name = "NAME", nullable = false)
	private String name;
	@Column(name = "DESIGNATION")
	private String designation;
	@ManyToOne
	@JoinColumn(name = "DPT_ID")
	private Department department;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", department=" + department
//				+ "]";
//	}

}
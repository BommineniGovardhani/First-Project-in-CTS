package com.cts;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class EmployeeBean_Valid {
	@Min(4)//value must be greter than 4
String eno;
	@Size(min=4,max=20)
String name;
	@Min(value=20000,message="salary must be greter than or equal to 20000")
	@Max(value=45000,message="salary must be less than or equal to 45000")
float salary;
	@Pattern(regexp="^[a-zA-Z0-9]{6}",message="pincode must be 6 digits or chars")
String postal_code;
public String getEno() {
	return eno;
}
public void setEno(String eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getPostal_code() {
	return postal_code;
}
public void setPostal_code(String postal_code) {
	this.postal_code = postal_code;
}
}

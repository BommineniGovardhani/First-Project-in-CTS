package com.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.test.Employee_Jdbc;

public class Employee_JdbcTemplate1 {
	DataSource datasource;//read the db connection from xml
	JdbcTemplate jdbctemplate;//handle sql statements
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		jdbctemplate=new JdbcTemplate(datasource);
	}
	public List<Employee_Jdbc> listemp()
	{
		String SQL="select * from emp2";
		List<Employee_Jdbc> emps=jdbctemplate.query(SQL, new EmployeeMapper());
		
		return emps;
		
	}
	
	

}

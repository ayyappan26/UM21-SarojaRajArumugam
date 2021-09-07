package com.school.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.school.dto.StudentDto;


/**
 * An interface which implements two abstract methods.. 
 * 1. Viewing the details of all by their departments
 * 2. viewing the details of the particular department persons
 *
 */
public interface Idao {
	public abstract HashMap<String,ArrayList<StudentDto>> viewAllByDepartments() throws SQLException;
	public abstract ArrayList<StudentDto> viewStudentByDepartment(String deptname) throws SQLException;
}

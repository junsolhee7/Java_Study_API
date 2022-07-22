package com.iu.io.file.ex1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<StudentDTO> ar = new ArrayList<StudentDTO>();
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO studentDTO = new StudentDTO();
		
		studentDAO.getList();
		StudentDTO.getName();
		

	}

}

package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	StudentDTO studentDTO = new StudentDTO();

	//DTO : Data Transfer Object 수동적
	//DAO : Data Access Object 읽기,쓰기
	// file data에 접근
	 
	//1.getList :
	//studentData 파일의 내용을 읽어서 작업
	
	//list > set map
	
	// studentDTO에 저장
	
	//2.setList
	public int setList(ArrayList<StudentDTO> ar) {
		//예외처리는 내부에서 처리
		//List로 받은 데이터들을 studentData에다가 작성
		//기존의 내용은 삭제
		//작성 형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공
		//0을 리턴 : 예외가 발생했을 경우
	}
	
	public ArrayList<StudentDTO> getList() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		File file = new File("C:\\study","studentData.txt");	
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String str = br.readLine();
		str = br.readLine(); //str : iu,56,54,85
		System.out.println(str);
		String [] info = str.split(","); //info:
		StringTokenizer st = new StringTokenizer(str,",");
		st.nextToken();//iu
		st.nextToken();//1
		
		boolean check = true;
		
//		while(true) {
//			studentDTO.setName(null);
//			studentDTO.setNum(0);
//			studentDTO.setKor(0);
//			studentDTO.setEng(0);
//			studentDTO.setMath(0);
//		}
		return ar;
	}
}

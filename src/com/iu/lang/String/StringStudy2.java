package com.iu.lang.String;

import java.util.Scanner;

public class StringStudy2 {
	
	//String index of 메소드
	public void studyIndexOf(){
		String str = "Hello Java";
		
		int index = str.indexOf("a");
//		index = str.indexOf('a');
		index = str.indexOf("ll");
		System.out.println(index);
		
		 String replace = str.replace('l','w');
		 System.out.println(replace);//새로운문자
		 System.out.println(str);//기존문자유지
		 
		 str = "Google에 입사지원동기는 ... Google에 입사하면 노예가 ...";
		 System.out.println(str);
		 str = str.replace("Google","Samsung");
		 System.out.println(str);
		 
		 str = "hi";
		 String str2 = "h i ";//중간공백
		 str2 = str2.trim();//양끝공백제거
		 str2 = str2.replace(" ","");//중간공백제거
		 
		 System.out.println(str.equals(str2));//공백으로 인한 불일치
		 
		 
		 
		 
	}
	public void studyIndexOfEx1() {
		String names = "iu,suji,choa,hani";
		//1. names에는 몇개의 쉼표가 있는가? //내코드
		//2. 총 몇명입니까?
		
//		int commaNum = 0;
//		int peopleNum = 0;
//		int index = names.indexOf(',', 0);
//		
//		while(index != -1) {
//			System.out.print(index);
//			index = names.indexOf(',', index+1);
//			commaNum++;
//			System.out.println("\t"+commaNum);	
//		}
//		peopleNum = commaNum + 1;
//		System.out.println("쉼표 수 : "+ commaNum + "\t" + "사람 수 : "+ peopleNum);
//		
		boolean check = true; //강사님 코드
		int count = 0; //,의 갯수를 담은갯수
		int index = 0; //,의 찾은 인덱스 번호
		while(check) {
			index = names.indexOf(",", index);
			if(index == -1) {
				break;
			}else {
				count++;
				index++;
			}
		}//whlie의끝
		System.out.println(",의 갯수: " + count);
		System.out.println("인원 수: " + (count+1));
	}//메소드 끝
	
	public void studySubString() {
		//하나의 문자열을 분리하는 작업 (parsing)
		String member = "iu/1234";
		String pw = member.substring(3);
		String id = member.substring(0,2);
		System.out.println(pw);
		System.out.println(id);
	}//메소드끝

	public void ex2() {
		//키보드로부터 파일명을 입력 받음, ex) abc.txt , jpg.word
		//파일이 이미지파일인지 아닌지 구별
		//확장자가 jpg,png,gif,jpeg,
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하시오...");
		String input = sc.next();
		System.out.println(input);
		
		int dot = input.indexOf(".",0);
		System.out.println(". : "+ dot);
		
		String title = input.substring(0,dot);
		System.out.println("제목 : "+ title);
		
		String extension = input.substring(dot+1);
		System.out.println("확장자 : "+ extension);
		
		if(extension.equals("jpg")||extension.equals("png")||extension.equals("gif")||extension.equals("jpeg")) {
			System.out.println("이미지 파일입니다.");
		}else {
			System.out.println("이미지 파일이 아닙니다");
			System.out.println(extension);
		}
	}
	
	
	
	
	
}

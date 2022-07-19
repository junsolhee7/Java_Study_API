package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	
	//ex1
	//주민번호 입력   : 6-7 : 971224-1234567 (1,3남자/2,4여자)
	//1.남자 여자 판단
	//2.현재 나이 출력
	//3. 3-5월 : 봄
	//   6-8월 : 여름
	//   9-11월 : 가을
	//   12-2월 : 겨울
	
	public void genderAgeSeason(){
		int currentYear = 2022;
		int age = 0;
		String gender = "남자입니다";
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하시오 ...(xxxxxx-xxxxxxx)");
		String input = sc.next();
		String [] frontAndBack = input.split("-");
		String front = frontAndBack[0];
		String back = frontAndBack[1];

		int frontNum = Integer.parseInt(front.substring(0,2));
		int backNum = Integer.parseInt(back.substring(0,1));
		int season = Integer.parseInt(front.substring(2,4));
		
		System.out.println(frontNum);
		System.out.println(backNum);
		System.out.println(season);
		boolean old = false;
		if(backNum==1 || backNum==2){
		old=!old;
		}
		if(old==true){
		age = currentYear-(1900+frontNum)+1;
		}else if(old==false){
		age = currentYear-(2000+frontNum)+1;
		}
		System.out.println("나이 : "+ age);
		if(backNum==2 || backNum==4){
		gender = "여자입니다";
		System.out.println(gender);
		}else{
		System.out.println(gender);
		}
		if(season>2 && season<6){
		System.out.println(season+"월 봄생입니다.");
		}else if(season>5 && season<9){
		System.out.println(season+"월 여름생입니다.");
		}else if(season>8 && season<12){
		System.out.println(season+"월 가을생입니다.");
		}else if(season>11 && season<3){
		System.out.println(season+"월 겨울생입니다.");
		}
		
	}
	
	
	
	

}

package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
	Scanner sc = new Scanner(System.in);

	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<>();
		WeatherService ws = new WeatherService(); // WeatherService(),init(ArrayList<CityDTO> ar)
		//add(), remove(), find()
		WeatherView wv = new WeatherView();
		while(true) {
			System.out.println("1.날씨 정보 초기화");
			System.out.println("2.전국 날씨 출력");
			System.out.println("3.지역 날씨 검색");
			System.out.println("4.지역 정보 추가");
			System.out.println("5.지역 정보 삭제");
			System.out.println("6.종       료");
			System.out.println("===================================");
			int check = sc.nextInt();
			if (check == 1) {
				ws.init(ar);
				System.out.println("===================================");
				
			}else if (check == 2) {
				wv.view(ar);
				
			}else if (check == 3) {
				
			}else if (check == 4) {
				
			}else if (check == 5) {
				
			}else if (check == 6) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			
		}
	}
}
//WeatherController 
//start
//1.날씨정보초기화
//2.전국날씨출력
//3.지역날씨검색
//4.지역정보추가
//5.지역정보삭제
//6.종	    료
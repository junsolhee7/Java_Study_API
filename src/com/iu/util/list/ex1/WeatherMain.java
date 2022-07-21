package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherView wv = new WeatherView();
		WeatherService ws = new WeatherService();
		WeatherController wc = new WeatherController(ws);
		
		ArrayList<String> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2;
		
		ArrayList<ArrayList<String>> ars = new ArrayList<>();
		ArrayList<ArrayList<String>> ars2 = new ArrayList<>();
		
		ArrayList<ArrayList<ArrayList<String>>> all = new ArrayList<>();
		
//		ar2 = ar1; //다른 제네릭타입
		//쇼핑몰장바구니, 이론상무한중첩가능 , 중간요소삽입삭제속도가느림 -> (단점보완) 링크드리스트
		
		//1.클래스의 역할과 메서드의 역할, 변수의 역할
		// WeatherMain       : 프로그램 실행, Test
		// WeatherService    : 가공
		// WeatherController : 관리
		// WeatherView       : 출력전용
		// CityDTO           : Data, 가방
		

		wc.start();
		


		
//		CityDTO cityDTO = new CityDTO();
//		cityDTO.setName("NY");
//		cityDTO.setGion(31.2);
//		cityDTO.setHum(20);
//		cityDTO.setStatus("비");
//		
//		CityDTO cityDTO2 = new CityDTO();
//		cityDTO2.setName("LA");
//		cityDTO2.setGion(31.2);
//		cityDTO2.setHum(20);
//		cityDTO2.setStatus("눈");
//		
//		ArrayList<CityDTO> ar = new ArrayList<>();
//		ar.add(cityDTO);
//		ar.add(cityDTO2);
//		
//		wv.view(ar);
//		ws.add(ar);
//		wv.view(ar); //테스트
//		wv.view("message test"); //테스트		
	}
}

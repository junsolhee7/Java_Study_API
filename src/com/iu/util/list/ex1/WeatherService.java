package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherService {

	private StringBuffer sb;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍");
	}
	public void init(ArrayList<CityDTO> ar) {
		CityDTO cd = new CityDTO();
		System.out.println("1번 선택");
		
		String str = sb.toString();
		str = str.replace("-",",");
		
		StringTokenizer st = new StringTokenizer(str,",");
		String token = "";
		while(st.hasMoreTokens()) {
			token = st.nextToken();
			cd.setName(token);
			
		}
		//init메서드
		//sb에있는 Data들을 파싱해서 CityDTO에 담아서 리턴
	}
	
	public void add(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		cityDTO.setName("test");
		cityDTO.setGion(20.3);
		cityDTO.setHum(80);
		cityDTO.setStatus("rain");
		ar.add(cityDTO);
//		add메서드
//		city정보를 입력받아서 추가

	}

	public void remove() {
//		remove메서드
//		//도시명을 입력받아서 리스트에서 삭제
		
	}

	public void find() {
//		find 메서드
//		도시명을 입력받아서 리스트에서 검색 리턴
		
	}



}

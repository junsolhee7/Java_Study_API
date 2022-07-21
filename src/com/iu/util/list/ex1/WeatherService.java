package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	Scanner sc = new Scanner(System.in);
	ArrayList ar = new ArrayList();
	CityDTO cityDTO  = new CityDTO();

	private StringBuffer sb;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍");
	}
	public void init(ArrayList<CityDTO> ar) {
		
		System.out.println("1번 선택");
		
		String str = sb.toString();
		str = str.replace("-",",");
		
		StringTokenizer st = new StringTokenizer(str,",");
		String token = "";
		while(st.hasMoreTokens()) {
			
			cityDTO.setName(sc.next());
			cityDTO.setGion(Double.parseDouble(sc.next()));
			cityDTO.setHum(Integer.parseInt(sc.next()));
			cityDTO.setStatus(sc.next());
			
		}
		
	}//init메서드 끝
	//sb에있는 Data들을 파싱해서 CityDTO에 담아서 리턴
	
	public boolean add(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = new CityDTO();
		cityDTO.setName("test");
		cityDTO.setGion(20.3);
		cityDTO.setHum(80);
		cityDTO.setStatus("rain");
		ar.add(cityDTO);
		return ar.add(cityDTO);


	}//		add메서드 끝
//	city정보를 입력받아서 추가

	public boolean remove() {
		System.out.println("삭제 하려는 도시명 입력");
		String name = sc.next().toUpperCase();
		boolean r = false;
		
		for(int i=0; i<ar.size(); i++) {
		if(name.equals(((CityDTO) ar.get(i)).getName().toUpperCase())) {
			ar.remove(cityDTO);
			r = !r;
			break;
		}
	} return r;
		//향상된 for문
//		for(CityDTO cityDTO : ar) {
//			if(name.equals(cityDTO.getName())) {
//				ar.remove(cityDTO);
//				break;
//			}
//		}
//		
		
	}//remove메서드 끝 : 도시명을 입력받아서 리스트에서 삭제

	public CityDTO find(ArrayList<CityDTO> ar) {
		CityDTO cityDTO = null;
		
		System.out.println("찾을 도시명 입력");
		String name = sc.next().toLowerCase();
		
		for(CityDTO cityDTO2 : ar) {
			if(name.equals(cityDTO2.getName().toLowerCase())) {
				cityDTO = cityDTO2;
				break;
			}
		}
		return cityDTO;
	}//		find 메서드 끝 : 	도시명을 입력받아서 리스트에서 검색 리턴





}

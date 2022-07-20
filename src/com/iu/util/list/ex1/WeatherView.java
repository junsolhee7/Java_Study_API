package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherView {
	
	public void view(ArrayList<CityDTO> ar) {
		for(int i=0;i<ar.size();i++) {
			CityDTO cityDTO = ar.get(i);
			this.view(cityDTO);
		}
		
//		리스트를 받아서 모든 정보를 출력		
	}
	public void view(CityDTO cityDTO) {
		System.out.println(cityDTO.getName());
		System.out.println(cityDTO.getGion());
		System.out.println(cityDTO.getHum());
		System.out.println(cityDTO.getStatus());
//		city 하나를 받아서 모든 정보를 출력		
	}
	public void view(String message) {
		System.out.println(message);
//		메시지(String)하나를 받아서 출력		
	}
}

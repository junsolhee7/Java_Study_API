package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	private WeatherService ws; 
	private Scanner sc;
	private WeatherView wv;

	
	//결합도가 강하다(높다) : 자체에서 객체 생성
	//결합도가 느슨하다(낮다) : 매개변수를 통해서 만들어진 객체를 주입
	//					: 생성자의 매개변수, Setter,
	
	public WeatherController(WeatherService ws) {
		this.ws = new WeatherService();// WeatherService(),init(ArrayList<CityDTO> ar)
		//add(), remove(), find()
		this.sc = new Scanner(System.in);
		this.wv = new WeatherView();//ws,wv에 의존적이다, 을 참조하다 wc->ws, wc->wv 
	}
	
	public void start() {
		ArrayList<CityDTO> ar = new ArrayList<>();
		boolean check = true;
		while(check) {
			System.out.println("1.날씨 정보 초기화");
			System.out.println("2.전국 날씨 출력");
			System.out.println("3.지역 날씨 검색");
			System.out.println("4.지역 정보 추가");
			System.out.println("5.지역 정보 삭제");
			System.out.println("6.종       료");
			System.out.println("===================================");
			int select = sc.nextInt();
			if (select == 1) {
				ws.init(ar);
				System.out.println("===================================");
			}else if (select == 2) {
				wv.view(ar);
			}else if (select == 3) {
				CityDTO cityDTO = ws.find(ar);
				if(cityDTO != null) {
					wv.view(cityDTO);
				}else {
					wv.view("잘못된 도시명");
				}
			}else if (select == 4) {
				boolean result = ws.add(ar);
				String message = "추가 실패";
				if(result) {
					message = "추가 성공";
					
				}
				wv.view(message);
				
			}else if (select == 5) {
				ws.remove();
				
			}else if (select == 6) {
				System.out.println("종료되었습니다.");
				check = !check;
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
package com.iu.string.ex1;

public class WorkerView {

	//view메소드
	//WorkerDTO 들을 받아서 정보를 출력
	public void view(WorkerDTO [] workerDTOs) {
		for(WorkerDTO workerDTO : workerDTOs) {
			System.out.println("이름 : "  +_workerDTO.getName());
			System.out.println("부서 : " _+ workerDTO.getDepartment());
			System.out.println("직급 : " _+ workerDTO.getJob());
			System.out.println("번호 : " _+ workerDTO.getPhone());
		}
		
	}
	
}

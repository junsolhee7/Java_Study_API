package com.iu.string.ex1;

public class WorkerService {

	private StringBuffer sb;
	private String info;
	
	public WorkerService() {
		info = "iu-인사과-과장-0101111";
		info = info + ", suji-IT-대리-0102222";
		info = info + ", choa-영업-부장-0103333";
		info = info + ", hani-마케팅-사원-0104444";
	}
	
	WorkerDTO wd = new WorkerDTO();
	
	public WorkerDTO [] init() {
		String newInfo = this.info.replace(",","-");
		
		String [] infos = newInfo.split("-");
		
		WorkerDTO [] workerDTOs = new WorkerDTO[infos.length/4];
		
		System.out.println(infos.length);
		
		for(int i=0;i<infos.length;i++) {
			WorkerDTO workerDTO = new WorkerDTO();
			workerDTOs[i/4] = workerDTO;
			workerDTO.setName(infos[i].trim());
			workerDTO.setDepartment(infos[++i].trim());
			workerDTO.setJob(infos[++i].trim());
			workerDTO.setPhone(infos[++i].trim());	
		}
//		for(String str:infos) {
//			System.out.println(str);
//		}
//		
		return null;
	}
	
	//info 파싱해서 WorkerDTO에 대입하고
	//WorkerDTO를 모은배열을 리턴
	//이름,부서명,직급,전화번호
}

package com.iu.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {

		//file :: 파일이나 폴더의 정보를 담는 클래스
		//        실제 파일이나 폴더가없을수도있음
		File file = new File("C:\\study"); //폴더명_파일
		// parent : 폴더, child : 파일명 또는 최종 폴더명
		file = new File("C:\\study","test.txt"); //폴더명_파일
		
		//1.폴더명 경로가있는 File 객체 이용
		File path = new File ("C:\\study"); //폴더명_파일)
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println("=================");
		System.out.println(path.exists());
		System.out.println(path.isFile());
		System.out.println(path.isDirectory());
		
		File file2 = new File("C:\\study\\sub2\\t1");
//		file.mkdir(); 중간에 폴더가 없으면 생성 X
		file.mkdirs();
		
//		file.delete();
		File file3 = new File("C:\\study\\sub2");
//		file2.delete();
		
		if(!file.exists()) {
			file.mkdir();
		}
		

	}

}

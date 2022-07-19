package com.iu.lang.String;

public class StringMain1 {

	public static void main(String[] args) {

		String str1 = "iu";
		String str2 = "iu";
		String str3 = new String("iu");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("====================");
		
//		System.out.println(str.equals(str2));
		System.out.println(str3);
		
		
		StringStudy ss = new StringStudy();
//		ss.st;
		StringStudy2 ss2 = new StringStudy2();
		StringStudy3 s3 =new StringStudy3();
		ss2.studyIndexOf();
		System.out.println("====================");
		ss2.studyIndexOfEx1();
		System.out.println("====================");
//		ss2.studySubString();
//		System.out.println("====================");
//		ss2.ex2();
		System.out.println("====================");
		s3.studySplit();
		System.out.println("====================");
		s3.studySplit2();
		System.out.println("====================");
		s3.studySplit3();
	}
}
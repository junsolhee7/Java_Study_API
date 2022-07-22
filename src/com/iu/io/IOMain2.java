package com.iu.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		InputStream is = System.in; //0,1
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		try{
			System.out.println("입력");	
		}catch(Exception e) {
			e.printStackTrace();	
		}finally {
			try {
				br.close(); //연결된 역순으로 자원을 해제
				ir.close();
				is.close();
			}catch (Exception e) {
				//
			}
			
			
		}
		
		
		
		//DDOS
		//Denial of Service		
		

	}

}

package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {
	
	
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Socket socket = new Socket("192.168.7.23", 8739);
		
		System.out.println("Server 접속 완료");
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check = true;
		
		while(check) {
			System.out.println("서버로 보낼 메세지 입력");
			String message=sc.next();
			
			os = socket.getOutputStream();//0,1
			ow = new OutputStreamWriter(os);//문자
			bw = new BufferedWriter(ow);
			
			//전송
			bw.write(message+"\r\n");
			bw.flush();
			if(message.toLowerCase() == "q") {
				check = false;
			}
			
			
			//---------------------------------------------
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			message = br.readLine();
			System.out.println("Server : "+message);
			
			if(message.toLowerCase().equals ("q")) {
				break;
			}
		}
		//자원해제
		bw.close();
		ow.close();
		os.close();
		socket.close();
			
		
	}

}
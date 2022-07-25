package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	
	public void receive() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = new ServerSocket(8739);
		//서버 오픈하고 Client의 접속을 기다림
		System.out.println("Client 접속 기다리는 중");
		//Socket : 상대방과 1:1 통신 
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		boolean check2 = true;
		while(check2) {
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			String message = br.readLine();
			System.out.println("Client : "+message);
			if(message.toLowerCase() == "q") {
				check2 = false;
			}
			
			//----------------------------------------
			os = socket.getOutputStream();//0,1
			ow = new OutputStreamWriter(os);//문자
			bw = new BufferedWriter(ow);
			System.out.println("클라이언트로 보낼 메세지 입력");
			message=sc.next();
			if(message.toLowerCase() == "q") {
				check2 = false;
			}
			//전송
			bw.write(message+"\r\n");
			bw.flush();
			
		}
		br.close();
		ir.close();
		is.close();
		socket.close();
		serverSocket.close();
		
			
			
		
	}

}
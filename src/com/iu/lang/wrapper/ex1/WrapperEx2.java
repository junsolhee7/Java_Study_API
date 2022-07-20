package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	//juminCheck
	//주민번호 입력
	//  9  7  1  1  2  4  -  1  2  3  4  5  6 7(체크용 번호)
	// *2 *3 *4 *5 *6 *7    *8 *9 *2 *3 *4 *5
	// 18 21  4  5  12 28    8 18  6 12 20 30
	// 총합 : 88+ 110 = 192
	// 총합을 11로 나누어서 나머지를 구함
	// 나머지 5
	// 11 - 나머지(5) = 결과(6)
	// 나머지를 11에서 뺸 결과를 체크용 번호와 같은지 비교
	// 결과 = 체크용번호면 정상
	// 만약에 위의 연산결과가 두자리라면
	// 위에서 연산결과를 다시 10으로 나눈 나머지와 체크용번호를 비교
	// 11/10 --- 나머지 1
	
	public void juminCheck(){
		System.out.println("주민번호를 입력하시오...");
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		String jumin2 = jumin.replace("-","");
		int sum = 0;
		int remainder=0;
		int check = 0;
		int lastCheck = 0;
		for(int i=0; i<8;i++) {
			sum += (jumin2.charAt(i)-'0') * (i+2);
		} 
		//1.String num = String valueOf(ch);
		//2.int n = Integer.parseInt(num)
		//  int n = Integer.parseInt(ch+"");
		//3. int n = Integer.parseInt(String.valueOf(ch));
		//4. n =Integer.parseInt(String.valueOf(jumin.charAt(0)));
		for(int i=8; i<12;i++) {
			sum += (jumin2.charAt(i)-'0') * (i-6);
		}
		System.out.println("총합:"+sum);
		
		remainder = sum % 11;
		System.out.println("11로 나눈 나머지:"+remainder);
				
		lastCheck = 11-remainder;
		lastCheck %= 10;
		System.out.println("11에서 나머지를 뺀 값:"+lastCheck);
		
		check = jumin2.charAt(12)-'0';
		System.out.println("체크용 번호:"+check);
		
		if(check==lastCheck) {
		System.out.println("11에서 총합을 11로 나눈 나머지를 뺸 값이 체크용 번호와 일치합니다.");
		}else {
			System.out.println("일치하지 않습니다.");
		}
		
	}
}

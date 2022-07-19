package com.iu.lang.wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {

		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String num = "10";
		Integer integer = new Integer(num); //줄 의미 : depricate (쓰지 말것을 권장)
		
		int n = integer.intValue();
		
		n=50;
		integer = new Integer(n);
		
		integer = n; //auto-boxing
		n=integer; //auto-unboxing
		
		long l = 10L;
		Long ll = l;
		
		integer = (int)1;
//		integer = ll;
		
		String num1 = "10";
		String num2 = "3.12";
		String num3 = "60";

		int n1 = Integer.parseInt(num1);
		double n2 = Double.parseDouble(num2);
		long n3 = Long.parseLong(num3);
		System.out.println(n2);
		System.out.println(n3*2);
		System.out.println(n+2);

	}

}

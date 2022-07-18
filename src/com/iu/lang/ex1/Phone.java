package com.iu.lang.ex1;

public class Phone {

	private String brand;
	private int price;
	private int size;
	
	// equals 메서드 오버라이딩
	// 각 멤버의 값이 같으면 true, 하나라도 틀리면 false 리턴
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean equals(Object obj) {
		Phone phone = (Phone) obj;
		boolean check = false;
		if (this.getPrice() == phone.getPrice() && this.getSize() == phone.getSize() ) {
			check = !check;
		}else {
			System.out.println("하나라도 다릅니다.");
		}
		return check;
	}
	
}

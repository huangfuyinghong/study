package java.access07;

public class MyNumber {
	
	// 멤버 변수 
	private int number;  
	
	// 기본 생성자 
	public MyNumber() {}
	// 생성자  
	public MyNumber(int number) { 
		this.number = number; 
	}
	
	
	// private 멤버 변수를 간접적으로 읽어오는 메소드 - getter
	public int getNumber() {
		return number;
	}
	// private 멤버 변수를 간접적으로 변경하는 메소드 - setter
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void addtoNumber(int x) { 
		number += x;
	}
	
	// public으로 함수 선언 
	// 리턴타입 : MyNumber
	// 함수이름 : add 
	// 매개변수 : MyNumber number  
	// 기능 : 현재 객체의 number와 매개변수에 있는 number를 더한 후 
	// MyNumber 객체(this)를 리턴하는 메소드  
	public MyNumber add(MyNumber number) { 
		this.number = this.number + number.number;
		return this;
	}
	
	
	
	 
 	
 
} // end MyNumber 

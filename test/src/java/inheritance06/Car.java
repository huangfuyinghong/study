package java.inheritance06;

public class Car {
	
	// 멤버 변수 
	private int fuel; 
	
	// 생성자 
	public Car() {}
	public Car(int fuel) { 
		this.fuel = fuel;
	}
	
	// getter / setter 
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	// 메소드 
	public void display() { 
		System.out.println("자동차 연로 : " + fuel);
	}

} // end Car

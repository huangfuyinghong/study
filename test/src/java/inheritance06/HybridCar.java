package java.inheritance06;

public class HybridCar extends Car {
	
	// 멤버 변수 
	private int battery; 
	
	// 생성자 
	public HybridCar() {}
	public HybridCar(int battery) { 
		this.battery = battery;
	}
	
	// getter / setter 
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	@Override
	public void display() { 
		System.out.println("하이브리드 자동차 연료  : " + getFuel());
		System.out.println("하이브리드 자동차 배터리 : " + battery);
	}

} // end HybridCar

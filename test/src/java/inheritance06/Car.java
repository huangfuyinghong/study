package java.inheritance06;

public class Car {
	
	// ��� ���� 
	private int fuel; 
	
	// ������ 
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
	
	// �޼ҵ� 
	public void display() { 
		System.out.println("�ڵ��� ���� : " + fuel);
	}

} // end Car

package java.interface06;

public class Tv implements RemoteControl {

	@Override
	public void turnOn() { 
		System.out.println("TV ����");
	}
	
	@Override
	public void turnOff() { 
		System.out.println("TV ����");
	}
	
} // end Tv

package java.interface06;

public class Tv implements RemoteControl {

	@Override
	public void turnOn() { 
		System.out.println("TV ÄÑÁü");
	}
	
	@Override
	public void turnOff() { 
		System.out.println("TV ²¨Áü");
	}
	
} // end Tv

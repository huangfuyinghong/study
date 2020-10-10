package java.interface06;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() { 
		System.out.println("Audio ÄÑÁü");
	}
	
	@Override
	public void turnOff() { 
		System.out.println("Audio ²¨Áü ");
	}
	
}

package java.interface06;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() { 
		System.out.println("Audio ����");
	}
	
	@Override
	public void turnOff() { 
		System.out.println("Audio ���� ");
	}
	
}

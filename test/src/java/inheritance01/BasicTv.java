package java.inheritance01;

public class BasicTv {
	
	// ��� ����(�ʵ�, ������Ƽ)
	boolean powerOn;
	private boolean channel; 
	private int volume; 
	
	// ������ 
	public BasicTv() {} 
	
	// �޼ҵ� 
	public void turnOnOff() { 
		if(powerOn) { 
			powerOn = false; 
			System.out.println("TV OFF");
		} else { 
			powerOn = true; 
			System.out.println("TV ON");
		}
	} // end trunOnOff()

} // end BasicTV

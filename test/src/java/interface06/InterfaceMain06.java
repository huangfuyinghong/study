package java.interface06;

public class InterfaceMain06 {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.turnOn();
		tv.turnOff();
		
		Audio audio = new Audio();
		audio.turnOn();
		audio.turnOff();
		
		System.out.println();
		
		// �������̽� Ȱ�� : ������ �̿�  
		RemoteControl rc1 = new Tv();
		rc1.turnOn();
		
		RemoteControl rc2 = new Audio();
		rc2.turnOn();
		
		// �������̽� Ÿ���� �迭  
		RemoteControl[] arrRc = new RemoteControl[2];
		arrRc[0] = tv;
		arrRc[1] = audio;
		

	} // end main() 

}

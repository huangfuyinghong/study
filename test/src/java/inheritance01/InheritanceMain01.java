package java.inheritance01;

public class InheritanceMain01 {

	public static void main(String[] args) {
		
		// SmartTv Ŭ������ �ν��Ͻ� ����  
		SmartTv tv1 = new SmartTv(); 
		tv1.powerOn = true;
		tv1.turnOnOff();  // �ڽ� Ŭ������ �θ� Ŭ������ �޼ҵ� ��� ���� 
		tv1.setIp("172.16.1.31"); // ���� Ŭ������ �޼ҵ� ��� 
		
		BasicTv tv2 = new BasicTv(); 
//����      tv2.setIp("");  // �θ� Ŭ������ �ڽ� Ŭ������ �޼ҵ带 ����� �� ����. 
		
		
	} // end main()

} // end inheritanceMain

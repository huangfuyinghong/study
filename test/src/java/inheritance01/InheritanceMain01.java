package java.inheritance01;

public class InheritanceMain01 {

	public static void main(String[] args) {
		
		// SmartTv 클래스의 인스턴스 생성  
		SmartTv tv1 = new SmartTv(); 
		tv1.powerOn = true;
		tv1.turnOnOff();  // 자식 클래스는 부모 클래스의 메소드 사용 가능 
		tv1.setIp("172.16.1.31"); // 본인 클래스의 메소드 사용 
		
		BasicTv tv2 = new BasicTv(); 
//에러      tv2.setIp("");  // 부모 클래스가 자식 클래스의 메소드를 사용할 수 없음. 
		
		
	} // end main()

} // end inheritanceMain

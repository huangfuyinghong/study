package java.inheritance03;

public class Phone {

	// 멤버 변수 
	private String phoneNum; 
	
	// 생성자를 하나라도 정의한 경우, 자바 컴파일러는 기본생성자를 자동으로 만들어주지 않음! 
	public Phone(String phoneNum) { 
		this.phoneNum = phoneNum;
		System.out.println("phone(phoneNum) 생성자 호출") ;
	}

	// getter / setter 
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
} // end Phone

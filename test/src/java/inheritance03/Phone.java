package java.inheritance03;

public class Phone {

	// ��� ���� 
	private String phoneNum; 
	
	// �����ڸ� �ϳ��� ������ ���, �ڹ� �����Ϸ��� �⺻�����ڸ� �ڵ����� ��������� ����! 
	public Phone(String phoneNum) { 
		this.phoneNum = phoneNum;
		System.out.println("phone(phoneNum) ������ ȣ��") ;
	}

	// getter / setter 
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
} // end Phone

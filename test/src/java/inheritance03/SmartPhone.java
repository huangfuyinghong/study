package java.inheritance03;

public class SmartPhone extends Phone {
	
	private String ip; 
	
	// ������ 
	// - �ڽ� Ŭ������ �����ڰ� ȣ��Ǹ�,. 
	//   �θ� Ŭ������ �����ڰ� ���� ����� �Ŀ�, �ڽ� Ŭ������ �ڵ���� ����� 
	//   1) �θ� Ŭ������ �����ڸ� ��������� ȣ������ ���� ���� supr()�� �ڵ����� ȣ��
	//   2) �θ� Ŭ������ �����ڸ� ��������� super(); �Ǵ� super(�Ű�����); �� ȣ�� ���� 
	// - ���࿡ �θ� Ŭ������ �⺻ �����ڸ� ������ ���� ���� ��쿡�� 
	//   super()�� �ڵ����� ȣ��� �� ���� ������, 
	//   �ڽ� Ŭ������ �����ڿ��� super(�Ű�����)�� ȣ���ϴ� �ڵ尡 �ݵ�� �־�� ��  
	
	public SmartPhone() { 
		super(null);
		System.out.println("SmartPhone ������ ȣ�� ");
	}
	public SmartPhone(String phoneNum) { 
		super(phoneNum);
		System.out.println("SmartPhone(PhoneNum) ������ ȣ��");
	}
	public SmartPhone(String phoneNum, String ip) { 
		super(phoneNum);
		this.ip = ip; 
		System.out.println("SmartPhone(phoneNum, ip) ������ ȣ��");
	}

	
} // end SmartPhone

package java.inheritance02;

public class BusinessPerson extends Person {

	// ��� ���� 
	private String company;
	
	// ������ 
	// - �ڽ� Ŭ������ �����ڰ� ȣ��Ǹ�, �θ� Ŭ������ �����ڰ� ���� ȣ��Ǿ�� ��  
	// - �θ� Ŭ������ �����ڸ� ��������� ȣ���� ���� super(); 
	// - �θ� Ŭ������ �����ڸ� ��������� ȣ������ ������, �θ�Ŭ������ "�⺻ ������"�� �ڵ����� ȣ���
	// - �θ� Ŭ������ �Ű������� �ִ� �����ڴ� �ڵ����� ȣ����� �ʱ� ������, 
	//   �ʿ��� ���� �ݵ�� ��������� ȣ���ؾ� ��    ����) super(name)
	// - �ڽ� Ŭ������ �����ڿ��� �θ� Ŭ������ �����ڸ� ȣ���� ���� 
	//   �ٸ� � �ڵ庸�� ���� �θ� Ŭ������ ȣ���ؾ� �� 
	
	public BusinessPerson() { 
		super();  // �θ� Ŭ������ �⺻������ ȣ�� -> ���� ����  
		System.out.println("BusinessPerson ������");
	}

	public BusinessPerson(String name, String company) {
		super(name); // �θ� Ŭ������ �Ű����� �����ڸ� ��������� ȣ���� ��� -> ���� �Ұ� 
		this.company = company;
		System.out.println("BusinessPerson(name, company) ������");
	}

	// getter / setter 
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
	
	
} // BusinessPerson

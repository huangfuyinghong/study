package java.access04;

public class Contact {
	
	// ��� ���� 
	private String name; 
	private String phone;
	private String email;
	
	public Contact() {} 
	public Contact(String name, String phone, String email) { 
		this.name = name;
		this.phone = phone; 
		this.email = email; 
	}
	
	// getter / setter �޼ҵ� 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void displayInfo() { 
		System.out.println("--- ����ó ���� ---");
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phone);
		System.out.println("�̸��� : " + email);
	}
	
	

} // end Contact 

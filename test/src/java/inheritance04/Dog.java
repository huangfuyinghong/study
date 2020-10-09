package java.inheritance04;

public class Dog extends Animal {
	
	// ��� ���� 
	private String type;
	
	// ������ overloading
	public Dog() {}
	public Dog( String name, String type) { 
		super(name);
		this.type = type;
	}
	
	// �޼ҵ� ������(override) 
	// - �θ� Ŭ������ ������ �ִ� �޼ҵ带 �ڽ� Ŭ�������� ������ (�ٽ� ����)
	// - �޼ҵ��� ���� Ÿ��, �̸�, �Ű����� ��� ��ġ�ؾ� ��  
	
	@Override
	public void speak() { 
		System.out.println("�۸�");
	}
	
	
	

}

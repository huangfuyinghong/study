package java.inheritance05;

public class Person {

	private String name; 
	
	public Person() {}
	public Person(String name) { 
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// �ڹ��� ��� Ŭ������ java.lang.Object Ŭ������ ��ӹ޾Ƽ� �������! 
	// �ڹ��� ��� Ŭ������ Object Ŭ������ public �޼ҵ���� ��ӹ޾Ƽ� ��� ���� 
	// Object Ŭ������ toString() �޼ҵ� : 
	// - ��Ű���̸�.Ŭ�����̸�@������(�ּҰ�) ���� 
	
	@Override // annotation(������̼�) : Ư�� ������ �Լ��� ���¸� ǥ�� 
	public String toString() {
		return name + "�Դϴ�.";
	}
	
	// �޼ҵ� �����ε� 
	public String toString(String str) { 
		return name + str;
	}
	
	
	
	
	
	
}

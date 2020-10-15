package java.inner06; 

class Person { 
	// ��� ���� 
	private String name;  
	
	// ������ 
	public Person(String name) { 
		this.name = name; 
	}
	
	// �޼ҵ� 
	public PersonInterface setAge(int age) { // ���� Ÿ�� : PersonInterface
	     // ���� Ŭ���� ���� 
		 class PersonWitAge implements PersonInterface { 
			 // ���� Ŭ������ ��� ���� 
			 private int age; 
			 // ������ 
			 public PersonWitAge(int age) { 
				 this.age = age; 
			 }
			 
			 @Override
			 public void showInfo() { 
				 System.out.println("�̸� : " + name); 
				 System.out.println("���� : " + age);
			 }
			 
			 @Override
			 public void hello() { 
				 System.out.println("�ȳ��ϼ���!");
			 }
			 
		 } // end PersonWitAge 
		 
		 // ���� Ŭ���� ��ü(����)�� ��� ���� 
		 PersonWitAge instance = new PersonWitAge(age);
		 
		 // ���� Ŭ���� ��ü(����)�� ����  
		 return instance; 
		
} // end setAge() 
	
} // end Person() 

interface PersonInterface { 
	
	public abstract void showInfo(); 
	public abstract void hello();
}


public class InnerMain06 {

	public static void main(String[] args) {
		
		// ���� Ŭ������ �޼ҵ带 �ܺο��� ����ϴ� ��� : 
		// 1. ���� Ŭ������ �޼ҵ���� ������ �������̽��� ���� 
		// 2. ���� Ŭ������ �������̽��� �����ϵ��� ����  
		// 3. �������� ����Ͽ� �޼ҵ��� ����Ÿ������ �������̽��� ����� �� ����  
		
		Person p = new Person("���"); 
		PersonInterface instance  = p.setAge(20);
		instance.showInfo();
		instance.hello();
		

	} // end main() 

} // end InnerMain06

package java.access07;

public class MyNumber {
	
	// ��� ���� 
	private int number;  
	
	// �⺻ ������ 
	public MyNumber() {}
	// ������  
	public MyNumber(int number) { 
		this.number = number; 
	}
	
	
	// private ��� ������ ���������� �о���� �޼ҵ� - getter
	public int getNumber() {
		return number;
	}
	// private ��� ������ ���������� �����ϴ� �޼ҵ� - setter
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void addtoNumber(int x) { 
		number += x;
	}
	
	// public���� �Լ� ���� 
	// ����Ÿ�� : MyNumber
	// �Լ��̸� : add 
	// �Ű����� : MyNumber number  
	// ��� : ���� ��ü�� number�� �Ű������� �ִ� number�� ���� �� 
	// MyNumber ��ü(this)�� �����ϴ� �޼ҵ�  
	public MyNumber add(MyNumber number) { 
		this.number = this.number + number.number;
		return this;
	}
	
	
	
	 
 	
 
} // end MyNumber 

package java.access03;

public class MyNumber {
	
	// ��� ����  
	private int number;
	
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
	
	public void addNumber(int x) { 
		number += x;
	}

} // end MyNumber

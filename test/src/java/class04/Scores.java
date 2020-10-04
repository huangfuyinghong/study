package java.class04;

public class Scores {
	
	// ��� ����(�ʵ�, ������Ƽ) 
	int kor; // ���� ����
	int eng; // ���� ����
	int math; // ���� ���� 

	
	// ������ overloading : �������� �̸��� ����.�Ű������� �ٸ� 
	public Scores() {} // �⺻������  
	public Scores(int kor, int eng, int math) { // �żҵ尡 �ִ� ������ 
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// �� ������ ������ �����ϴ� �޼ҵ� 
	public int calcTotal() { 
		return kor + eng + math;
	} // end calcTotal
	
	// ����� �����ϴ� �޼ҵ� 
	public double calcAverage() { 
		return (double) calcTotal()/3;
	}
	
} // end Scores

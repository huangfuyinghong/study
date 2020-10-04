package java.class04;

public class Student {
	
	// ��� ����(�ʵ�, ������Ƽ) 
	int stuNo;  // �л� ��ȣ 
	String name; // �л� �̸� 
	Scores scores; // �л��� ����
	
	// �Ű������� �ִ� ������ 
	public Student(int stuNo, String name, Scores scores) { 
		this.stuNo = stuNo;
		this.name = name;
		this.scores = scores;
	}
	
	// �л� ���� ��� �޼ҵ�
	public void displayStudentInfo() {
		System.out.println(" --- �л� ���� --- ");
		System.out.println("��ȣ: " + stuNo);
		System.out.println("�̸�: " + name);
		System.out.println("����: " + scores.kor);
		System.out.println("����: " + scores.eng);
		System.out.println("����: " + scores.math);
		System.out.println("����: " + scores.calcTotal());
		System.out.println("���: " + scores.calcAverage());
	}

} // end Student

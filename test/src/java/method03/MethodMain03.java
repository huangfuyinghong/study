package java.method03;

import java.util.Scanner;

public class MethodMain03 {

	public static void main(String[] args) {
		// 1. ����, ����, ���� ������ �Է¹޾Ƽ� ����  
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int kor = sc.nextInt();
		System.out.println("���� �Է�: ");
		int eng = sc.nextInt();
		System.out.println("���� �Է�: ");
		int math = sc.nextInt();
		sc.close();
		
		// 2. �Է¹��� ������ ��� 
		System.out.println("����: " + kor);
		System.out.println("����: " + eng);
		System.out.println("����: " + math);
		
		// 3. public static int calcTotal(int kor, int eng, int math)
		// �޼ҵ带 �����ϰ�, �Լ��� ȣ���Ͽ� �� ������ ����� ��� 
		int total = calcTotal(kor, eng, math);
		System.out.println("�հ�: " + total);
		
		// 4. public static double calcAverage(int total)
		// �޼ҵ带 �����ϰ�, �Լ��� ȣ���Ͽ� �� ������ ����� ���(�Ҽ������� ��Ȯ�ϰ�)
		double avg = calcAvg(total);
		System.out.println("��� : " + avg);
		
		// 5. public static char calcGrade(double avg) �޼ҵ带 �����ϰ� �Լ��� ȣ���Ͽ� ������ ��� 
				// ���� ��� ��� 
				//   100 ~ 90 : A
				//   89 ~ 80 : B
				//   79 ~ 70 : C
				//   69 ~ 0 : F
		char grade = calcGrade(avg);
		System.out.println("����: " + grade);
		

	} // end main()
	
	
	
	// // #3 �޼ҵ� ����  ( �� )
	public static int calcTotal(int kor, int eng, int math) { 
		return kor + eng + math;
	}
	
	// Alt + Shift + R : �̸� ���� ����Ű 
	
	// #4 �޼ҵ� ����  ( ��� ) 
	public static double calcAvg(int total) { 
		return total / 3.0;
	}
	
	// #5 �޼ҵ� ���� ( ��� ) 
	public static char calcGrade(double avg) { 
	char grade; 
	if(avg >= 90) { 
		grade = 'A';
	} else if(avg >=80) {
		grade = 'B';
	} else if(avg >= 70) { 
		grade = 'C';
	} else { 
		grade = 'F';
	} 
	return grade;
  }

} // end MethodMain03

package java.method04;

import java.util.Scanner;

public class MethodMain04 {

	public static void main(String[] args) {
		System.out.println("�迭�� �Ű������� ���� �޼ҵ�");
		
		// ����(int) 5���� ������ �� �ִ� �迭 ���� 
		int[] scores = new int[5];
		
		int a = 0;
		// �⺻ Ÿ�԰� ���� Ÿ���� ���� 
		System.out.println(a); // �⺻Ÿ���� ���� ��� 
		System.out.println(scores); // ���� Ÿ���� �ּҰ��� ��� 
		
		// �迭�� �Է�  
		inputScores(scores);
		
		// �迭�� ��� 
		printScores(scores);
		
		// scores �迭�� ����� �������� �ִ밪�� ���(�޼ҵ� ���)
				// �Լ��̸� : findMax
				// ��� : �迭 �� �߿� �ִ밪�� ã�Ƽ� ���  
				// ����Ÿ�� : void
				// �Ű����� : int[] scores
		findMax(scores);
		
		// scores �迭�� ����� �������� ��� ��ġ�� ���� ���(�޼ҵ� ���)
		findMin(scores);
		

	} // end main()
	
	
	private static void inputScores(int[] scores) { 
		System.out.println(scores);
		// �ּҰ��� ���̶��� ������ main�� �ִ� scores �迭�� ���� �����ϴ� �Ͱ� ���� 
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++) { 
			System.out.println("���� " + i + ">");
			scores[i] = sc.nextInt();
		}
		sc.close();
	} // end inputScores
	
	private static void printScores(int[] scores) { 
		System.out.println("<�Է��� ����>");
		for(int x : scores) { 
			System.out.println(x);
		}
	} // end printScores()
	
	private static void findMax(int[] scores) { 
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < scores.length; i++) { 
			if(max < scores[i]) { 
				max = scores[i];
			}
		}
		System.out.println("�ִ밪: " + max);
	} // end findMax 
	
	private static void findMin(int[] scores) { 
		System.out.println(scores[scores.length/2]);
	} // end findMin

} // end MethodMain04

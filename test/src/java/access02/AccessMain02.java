package java.access02;

import java.access01.Test01; // �ٸ� package�� �ִ� ������ ���� �� ... 

// �ٸ� package�� �ִ� ������ �ҷ� ���� 

public class AccessMain02 {

	public static void main(String[] args) {
		
		Test01 t2 = new Test01();
		t2.display();
//		t2.n1 = 100; // private : ���� �Ұ�, ���� Ŭ���������� ���� ���� 
//		t2.n2 = 200; // (package) : �ٸ� ��Ű���� �����Ƿ� ���� �Ұ�
//		t2.n3 = 300; // protected : �ٸ� ��Ű���̰�, ��ӹ��� �ʾ����Ƿ� ���� �Ұ� 
		t2.n4 = 400; // public : ��𼭵� ���� ���� 
		t2.display();
		
		
	} // end main()
 
} // end AccessMain02

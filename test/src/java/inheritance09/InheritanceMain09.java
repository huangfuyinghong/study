package java.inheritance09;

import java.inheritance10.Test3;

public class InheritanceMain09 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1(); 
//		t1.a = 1; // private : �ڱ��ڽ� Ŭ������ 
		t1.b = 2; // package : ���� ��Ű��  
		t1.c = 3; // protected : ���� ��Ű�� or ��ӹ޴� Ŭ���� 
		t1.d = 4; // public : ��𼭵��� 
		
		System.out.println();
		Test2 t2 = new Test2(); 
		t2.display();
		System.out.println();
		
	    Test3 t3 = new Test3();
	    t3.c = 30;
	    t3.d = 40;
	    t3.display();
	    
	} // end main()

} // end InheritanceMain09

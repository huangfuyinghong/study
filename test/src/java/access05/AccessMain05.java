package java.access05;


		
	// Ŭ������ ���� ���� ���ľ� : public, (package) 
	// 1. public class : ��𼭵��� �ν��Ͻ� ������ ������ Ŭ���� 
	// 2. (package) class : ���� ��Ű���� ���� Ŭ�����鿡���� �ν��Ͻ� ������ ���� 
	// ���ǻ��� 
	// - public class�� �̸��� �ݵ�� java ������ �̸��� ���ƾ� ��! 
	// - �ϳ��� java ���Ͽ� ���� ���� Ŭ������ �����ϴ� ���� ����������, 
	//   ���� ���Ͽ����� public class�� ���� �ϳ��� �־�� �� 
public class AccessMain05 {

	public static void main(String[] args) {	
		
		// ���� ��Ű���� �ִ� public class�� �ν��Ͻ� �������� 
		TestPublic test1 = new TestPublic();
		System.out.println(test1);
		
		// ���� ��Ű���� �ִ� (package) class�� �ν��Ͻ� ���� ���� 
	    TestPackage test2 = new TestPackage();
	    System.out.println(test2);

	} // end main()

} // end AccessMain

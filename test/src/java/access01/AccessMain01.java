package java.access01;

/*
���� ���� ���ľ�(Access Modifier)
1. ���� : private, (package), protected, public 
2. ��� : 
       1) ��� ������ ���� ���� ������ ����  
       2) �޼ҵ忡 ���� ���� ������ ���� 
       3) �����ڿ� ���� ���� ������ ���� 
       4) Ŭ������ ���� ���� ������ ����(package, public�� ��� ����) 
 3. �ǹ� 
       1) private : ����(����)�� Ŭ���� �ȿ����� ���� ����(���)�� ���� 
       2) (package) : ���� ��Ű���� �ִ� Ŭ�����鿡�� ���� ����(���)�� ���� 
       3) protected : ���� ��Ű���� �ְų� ��ӹ޴� Ŭ�����鿡�� ���� ����(���)�� ���� 
       4) public : ��𼭵��� ���� ����(���) ���� 
 4. ������ : 
       private < (package) < protected < public 
*/
public class AccessMain01 {

	public static void main(String[] args) {
		// test01 Ŭ������ �ν���Ʈ ���� 
		Test01 t1 = new Test01(); 
//		t1.n1 = 100; 
		// ���� -> class Test01�� �ִ�  n1������ Private ��� ���� �̱� �����̴�. 
		// private ��� ������ �ٸ� Ŭ�������� ���� ������ �Ұ���(������ ����) 
		// -> ���� �����ϰų� �о���� ���� 
		t1.n2 = 200; // (package) : ���� ��Ű���� �ֱ� ������ ���� ���� 
		t1.n3 = 300; // protected : ���� ��Ű���� �ֱ� ������ ���� ����
		t1.n4 = 400; // public : ��𼭵��� ���� ���� 
		t1.display();
		
	} // end main() 

} // end AccessMain01 

package java.interface01;

public class OracleDatabaseQuery implements DatabaseQuery  { // DatabaseQuery �������̽��� ����
	
	// abstract Ŭ������ ���������� override �� 
	
	@Override
	public int insert(String id, String pw) { 
		System.out.println("����Ŭ DB ����");
	    System.out.println("SQL ���� �ۼ�/����");
	    System.out.println("SQL ���� ��� ó��");
	    return 1; 
	}

}

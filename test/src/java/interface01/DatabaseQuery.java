package java.interface01;

public interface DatabaseQuery {

	// �������̽��� ��� �ټ� : public static final 
	public static final int DATABASE_VERSION = 1;
	
	// �������̽��� �޼ҵ� : public abstract 
	public abstract int insert(String id, String pw);
	
} // end DatabassQuery 

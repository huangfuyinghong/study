package java.interface01;

// 예 ) 다른 팀에서 임시로 테스트하기 위한 용도로 사용할 클래스 
public class DummyImple implements DatabaseQuery{

	@Override
	public int insert(String id, String pw) { 
		// 임시 테스트용 
		return 0;
	}
	
	
	
} // end DummyImple 

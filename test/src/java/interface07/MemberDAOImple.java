package java.interface07;

// DAO(Data Access Object) : MVC 패턴에서 constroller 클래스 
// - 데이터의 전송을 담당하는 역할 
public class MemberDAOImple implements MemberDAO {

	// --------------------------------------------- // 
	// Singleton 디자인 패턴 적용 시작  
	
	// 1. private static 자기 자신 타입의 멤버 변수 선언 
	private static MemberDAOImple instance = null; 
	
	// 2. private 생성자 
	private MemberDAOImple() {} 
	
	// 3. public static 메소드 - 인스턴스를 리턴하는 메소드 구현 
	public static MemberDAOImple getInstance() { 
		if (instance == null) { 
			instance = new MemberDAOImple(); 
		}
		return instance;
	}
	
	// Singleton 디자인 패턴 적용 끝 
	// ---------------------------------------------- // 
	
	public static final int MAX = 100; // 최대 회원수 
	private MemberVO[] list = new MemberVO[MAX]; // 회원 정보를 저장할 배열 
	private int count; // 배열에 저장된 데이터 개수  
	
	public int getCount() { 
		return count;
	}
	
	@Override
	public int insert(MemberVO vo) { 
		System.out.println(vo);
		// UI 클래스(main)가 전달해준 회원 정보를 배열에 저장 
		list[count] = vo;
		count++;
		return 1;  // 0 : 실패, 1 : 성공 
	}
	
	@Override
	public MemberVO[] select() { 
		// 전체 회원 정보(MemberVO[])를 리턴 
		return list;
	}
	
	@Override
	public MemberVO select(int index) { 
		// 선택된(index) 회원 정보(MemberVO)를 리턴 
		return list[index];
	}
	
	@Override
	public int update(int index, MemberVO vo) { 
		list[index].setPw(vo.getPw());
		list[index].setEmail(vo.getEmail());
		return 1;  // 0 : 실패, 1 : 성공
	}
	
}

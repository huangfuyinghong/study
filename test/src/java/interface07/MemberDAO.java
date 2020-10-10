package java.interface07;

// 회원 등록, 전체 검색, 검색, 수정 함수 생성  
public interface MemberDAO {
	
	// 회원 등록 
	public abstract int insert(MemberVO vo); 
	
	// 회원 전체 리스트 검색 기능 
	public abstract MemberVO[] select();
	
	// 회원 한명에 대한 상세 정보 검색 가능 
	public abstract MemberVO select(int index);
	
	// 회원 정보 수정  
	public abstract int update(int index, MemberVO vo);
	

}

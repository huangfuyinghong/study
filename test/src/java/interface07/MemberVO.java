package java.interface07;

// VO(Value Object) : MVC 디자인 패턴에서 Model 클래스.데이터 정보 
// DTO(Date Transfer Object) 

public class MemberVO {
	
	// 멤버 변수 (필드, 프로퍼티) 
	private String id; // 회원 아이디 
	private String pw; // 회원 비밀번호 
	private String email; // 회원 아이디 
	
	// 생성자 
	public MemberVO() {} 
	public MemberVO(String id, String pw, String email) { 
		super();
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	
	// getter / setter 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() { 
		String str = "아이디 : " + id + "\n"
				+ "비밀번호 : " + pw + " \n"
				+ "이메일 : " + email + "\n";   // "\n" : 줄바꿈
		return str;
	}

} // end MemberVO

package java.class04;

public class Scores {
	
	// 멤버 변수(필드, 프로퍼티) 
	int kor; // 국어 점수
	int eng; // 영어 점수
	int math; // 수학 점수 

	
	// 생성자 overloading : 생성자의 이름은 동일.매개변수가 다름 
	public Scores() {} // 기본생성자  
	public Scores(int kor, int eng, int math) { // 매소드가 있는 생성자 
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 세 과목의 총점을 리턴하는 메소드 
	public int calcTotal() { 
		return kor + eng + math;
	} // end calcTotal
	
	// 평균을 리턴하는 메소드 
	public double calcAverage() { 
		return (double) calcTotal()/3;
	}
	
} // end Scores

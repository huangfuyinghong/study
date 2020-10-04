package java.class04;

public class Student {
	
	// 멤버 변수(필드, 프로퍼티) 
	int stuNo;  // 학생 번호 
	String name; // 학생 이름 
	Scores scores; // 학생의 점수
	
	// 매개변수가 있는 생성자 
	public Student(int stuNo, String name, Scores scores) { 
		this.stuNo = stuNo;
		this.name = name;
		this.scores = scores;
	}
	
	// 학생 정보 출력 메소드
	public void displayStudentInfo() {
		System.out.println(" --- 학생 정보 --- ");
		System.out.println("번호: " + stuNo);
		System.out.println("이름: " + name);
		System.out.println("국어: " + scores.kor);
		System.out.println("영어: " + scores.eng);
		System.out.println("수학: " + scores.math);
		System.out.println("총점: " + scores.calcTotal());
		System.out.println("평균: " + scores.calcAverage());
	}

} // end Student

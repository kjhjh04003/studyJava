package chap06;

// 클래스로부터 객체 생성
// 실행용 클래스
public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(); // s1은 Student클래스의 인스턴스
		System.out.println("s1변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}

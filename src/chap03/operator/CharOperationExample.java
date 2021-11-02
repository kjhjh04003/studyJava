package chap03.operator;

// 이상 연산자 - 산술 연산자(char)
public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1; // 컴파일 에러 : 산술 연산의 산출 타입은 int이다. 
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
//		System.out.println("c3: " + c3);
	}
}

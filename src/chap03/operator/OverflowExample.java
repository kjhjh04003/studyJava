package chap03.operator;

// 산술연산 - 오버플로우 발생 및 해결
public class OverflowExample {
	public static void main(String[] args) {
		// 오버플로우 발생
//		int x = 1000000;
//		int y = 1000000;
//		int z = x * y;
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
		
		// 컴파일 에러는 발생하지 않지만, 변수 z에 올바른 값이 저장되지 않는다.
		// z의 결과값이 int 타입에 저장될 수 있는 값의 범위를 초과했기 때문이다.
	}
}

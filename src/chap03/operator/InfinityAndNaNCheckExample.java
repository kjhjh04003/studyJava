package chap03.operator;

// Infinity와 NaN
public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
//		double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		}
		else {
			System.out.println(z + 2); // 문제가 되는 코드	
		}
		
		// 정수 연산식 : 컴파일 정상, 실행 시 ArithmeticException 발생
		// 실수 연산식 : 예외 발생 x, / -> 무한대, % -> NaN 결과
	}
}

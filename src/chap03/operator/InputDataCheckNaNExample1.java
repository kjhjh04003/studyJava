package chap03.operator;

// "NaN" 문자열 문제점
public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput); // 입력값을 double 타입으로 변환
		
		double currentBalance = 10000.0;
		
		// NaN값은 산술 연산이 되어 어떠한 값과 연산 되어도 NaN값이 나온다.
		currentBalance += val; // currentBalance에 NaN이 저장됨
		System.out.println(currentBalance);
	}
}

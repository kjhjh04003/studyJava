package chap02.type;

//정수 타입을 실수 타입으로 변환할 때 정밀도 손실 확인2
public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		double num3 = num2;
		num2 = (int)num2;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}

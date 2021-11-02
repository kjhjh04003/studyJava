package chap03.operator;

// 이항 연산자 - 비트 이동 연산자
public class BitShiftExample {
	public static void main(String[] args) {
		System.out.println("1 << 3 = " + (1<<3));
		System.out.println("-8 >> 3 = " + (-8>>3));
		System.out.println("-8 >>> 3 = " + (-8>>>3));
	}
}

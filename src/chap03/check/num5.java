package chap03.check;

// 산술연산자만 사용
// 십의 자리 이하를 버리는 코드, 변수 value의 값이 356이라면 300이 나올 수 있도록 빈칸에 코드 넣기
public class num5 {
	public static void main(String[] args) {
		int value = 356;
		// 빈칸
		System.out.println(value - (value%300));
	}

}

package chap05.reference;

// 배열의 length 필드
public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		
		// for문의 조건식에서 < 연산자를 사용한 이유는 배열의 마지막 인덱스는 배열 길이보다 1이 적기 때문
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}

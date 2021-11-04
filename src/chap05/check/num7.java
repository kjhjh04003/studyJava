package chap05.check;

// 주어진 배열의 항목에서 최대값 구하기(for문 이용)
public class num7 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		// 작성 위치
		for (int i = 0; i < array.length; i++) {
			max = max > array[i] ? max : array[i];
		}

		System.out.println("max : " + max);
	}

}

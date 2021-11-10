package chap05.check;

// 주어진 배열의 전체 항목의 합과 평값 구하기(중첩 for이용)
public class num8 {

	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;

		// 작성 위치
		int count = 0; // 각 열의 길이값 더할 때 사용하는 변수
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
			count += array[i].length;
		}
		avg = (double) sum / count;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}

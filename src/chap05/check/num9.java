package chap05.check;

import java.util.Scanner;

// 학생수와 각 학생들의 점수를 입력받아서, 최고점수 및 평균 점수를 구하는 프로그램
public class num9 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // 학생수
		int[] scores = null; // 학생 점수
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				// 작성 위치
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
			} else if (selectNo == 2) {
				// 작성 위치
				scores = new int[studentNum];
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				// 작성 위치
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNo == 4) {
				// 작성 위치
				int max = 0;
				int sum = 0;
				double avg = 0.0;

				for (int i = 0; i < scores.length; i++) {
					max = max > scores[i] ? max : scores[i];
					sum += scores[i];
				}

				avg = (double) sum / scores.length;

				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}
}

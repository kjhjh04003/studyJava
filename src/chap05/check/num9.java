package chap05.check;

import java.util.Scanner;

// �л����� �� �л����� ������ �Է¹޾Ƽ�, �ְ����� �� ��� ������ ���ϴ� ���α׷�
public class num9 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // �л���
		int[] scores = null; // �л� ����
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("---------------------------------------------------");
			System.out.println("����> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				// �ۼ� ��ġ
				System.out.print("�л���> ");
				studentNum = sc.nextInt();
			} else if (selectNo == 2) {
				// �ۼ� ��ġ
				scores = new int[studentNum];
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				// �ۼ� ��ġ
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if (selectNo == 4) {
				// �ۼ� ��ġ
				int max = 0;
				int sum = 0;
				double avg = 0.0;

				for (int i = 0; i < scores.length; i++) {
					max = max > scores[i] ? max : scores[i];
					sum += scores[i];
				}

				avg = (double) sum / scores.length;

				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);
			} else if (selectNo == 5) {
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		}
	}
}

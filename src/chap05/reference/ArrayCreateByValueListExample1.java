package chap05.reference;

// �� ������� �迭 ����
public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0; // �迭 �� ���� ����
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		double avg = (double) sum / 3;
		System.out.println("��� : " + avg);

	}

}
package chap05.reference;

// �迭�� length �ʵ�
public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		
		// for���� ���ǽĿ��� < �����ڸ� ����� ������ �迭�� ������ �ε����� �迭 ���̺��� 1�� ���� ����
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("���� : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("��� : " + avg);
	}
}

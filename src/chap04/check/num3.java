package chap04.check;

// for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�� ����� ������ ���ϴ� �ڵ�
public class num3 {
	public static void main(String[] args) {
		int sum = 0; // �հ� ����

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) { // 3�� ������
				sum += i;
			}
		}
		System.out.println("3�� ����� �� : " + sum);
	}
}

package chap04.iteration;

// 1���� 100���� �� ���
public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0; // �հ� ����

		int i = 0; // ī���� ����
		for(i=1; i<=100; i++) {
			sum += i;
		}
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}

		System.out.println("1~" + (i-1) + " �� : " + sum);
	}
}
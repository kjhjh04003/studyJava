package chap04.check;

// while���� Math.random() �޼ҵ带 �̿��ؼ� �� ���� �ֻ����� ������ �� ������ ���� (��1, ��2) ���·� ���
// ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ�
public class num4 {
	public static void main(String[] args) {

		while (true) {
			int n1 = (int) (Math.random() * 5) + 1;
			int n2 = (int) (Math.random() * 5) + 1;

			System.out.println("(" + n1 + ", " + n2 + ")");

			if ((n1 + n2) == 5)
				break;
		}
	}
}

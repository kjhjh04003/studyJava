package chap03.operator;

// ������� - �����÷ο� �߻� �� �ذ�
public class OverflowExample {
	public static void main(String[] args) {
		// �����÷ο� �߻�
//		int x = 1000000;
//		int y = 1000000;
//		int z = x * y;
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
		
		// ������ ������ �߻����� ������, ���� z�� �ùٸ� ���� ������� �ʴ´�.
		// z�� ������� int Ÿ�Կ� ����� �� �ִ� ���� ������ �ʰ��߱� �����̴�.
	}
}

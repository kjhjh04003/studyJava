package chap05.check;

// �־��� �迭�� �׸񿡼� �ִ밪 ���ϱ�(for�� �̿�)
public class num7 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		// �ۼ� ��ġ
		for (int i = 0; i < array.length; i++) {
			max = max > array[i] ? max : array[i];
		}

		System.out.println("max : " + max);
	}

}

package chap03.check;

// ��ٸ��� ���̸� ���ϴ� �ڵ�
// ��Ȯ�� �Ҽ��ڸ��� ���� �� �ֵ��� ��ĭ �ֱ�
public class num6 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		//��ĭ
		// ��ٸ��� ���� : (��+�Ʒ�)*����/2
		double area = (double)(lengthTop+lengthBottom)*height/2;
		//double area = (lengthTop+lengthBottom)*height/2.0;
		System.out.println(area);
	}
}

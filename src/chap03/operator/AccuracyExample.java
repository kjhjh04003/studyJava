package chap03.operator;

// ��Ȯ�� ����� �ʿ��� ������ �ε��Ҽ��� Ÿ���� ������� �ʴ´�.
public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
//		double pieceUnit = 0.1;
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
//		double result = apple - number*pieceUnit;
		double result = temp/10.0;
		
		System.out.println("��� �Ѱ����� ");
		System.out.println("0.7 ������ ����, ");
		System.out.println(result + "������ ���´�.");
	}

}

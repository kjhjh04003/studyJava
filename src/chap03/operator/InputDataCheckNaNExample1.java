package chap03.operator;

// "NaN" ���ڿ� ������
public class InputDataCheckNaNExample1 {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput); // �Է°��� double Ÿ������ ��ȯ
		
		double currentBalance = 10000.0;
		
		// NaN���� ��� ������ �Ǿ� ��� ���� ���� �Ǿ NaN���� ���´�.
		currentBalance += val; // currentBalance�� NaN�� �����
		System.out.println(currentBalance);
	}
}

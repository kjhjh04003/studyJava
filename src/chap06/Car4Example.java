package chap06;

// return ��
public class Car4Example {

	public static void main(String[] args) {
		Car4 myCar = new Car4();

		myCar.setGas(5); // Car4�� setGas() �޼ҵ� ȣ��

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("���� ������ �ʿ�����ϴ�.");
		} else {
			System.out.println("������ �����ϼ���.");
		}

	}

}

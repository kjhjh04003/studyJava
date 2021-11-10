package chap06;

// return 문
public class Car4Example {

	public static void main(String[] args) {
		Car4 myCar = new Car4();

		myCar.setGas(5); // Car4의 setGas() 메소드 호출

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("가스 주입이 필요없습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}

	}

}

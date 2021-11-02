package chap04.check;

// while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력
// 눈의 합이 5가 아니면 계숙 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드
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

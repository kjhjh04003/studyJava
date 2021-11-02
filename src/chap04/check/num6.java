package chap04.check;

// for문을 이용해서 실행 결과와 같은 삼각형을 출력
// *
// **
// ***
// ****
// *****
public class num6 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

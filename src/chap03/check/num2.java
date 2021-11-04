package chap03.check;

// 출력 결과는?
public class num2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
	}

}

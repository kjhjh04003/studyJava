package chap04.iteration;

// ������ ����ϱ�
public class ForMultiplicationTableExample {
public static void main(String[] args) {
	for(int m=2; m<=9; m++) {
		System.out.println("*** " + m + "�� ***");
		for(int n=1; n<=9; n++) {
			System.out.println(m + " X " + n + " = " + (m*n));
		}
		System.out.println();
	}
}
}
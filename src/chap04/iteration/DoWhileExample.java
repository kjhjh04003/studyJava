package chap04.iteration;

import java.util.Scanner;

// do-while��
public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner sc = new Scanner(System.in); // Scanner ��ü ����
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine(); // Ű����� �Է��� ���ڿ��� ����
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");
	}
}
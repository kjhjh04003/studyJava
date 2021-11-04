package chap04.iteration;

import java.util.Scanner;

// do-while문
public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sc.nextLine(); // 키보드로 입력한 문자열을 얻음
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}
}

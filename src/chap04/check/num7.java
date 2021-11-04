package chap04.check;

import java.util.Scanner;

// while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
public class num7 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			
			int n = sc.nextInt(); // 선택값
			if(n == 1){
				System.out.print("예금액> ");
				int money = sc.nextInt();
				balance += money;
			}
			else if(n == 2) {
				System.out.print("출금액> ");
				int money = sc.nextInt();
				balance -= money;
			}
			else if(n == 3) {
				System.out.println("잔고> "+ balance);
			}
			else {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}

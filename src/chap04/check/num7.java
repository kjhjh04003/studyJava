package chap04.check;

import java.util.Scanner;

// while���� Scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ� ����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ� �ۼ�
public class num7 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------");
			System.out.print("����> ");
			
			int n = sc.nextInt(); // ���ð�
			if(n == 1){
				System.out.print("���ݾ�> ");
				int money = sc.nextInt();
				balance += money;
			}
			else if(n == 2) {
				System.out.print("��ݾ�> ");
				int money = sc.nextInt();
				balance -= money;
			}
			else if(n == 3) {
				System.out.println("�ܰ�> "+ balance);
			}
			else {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}

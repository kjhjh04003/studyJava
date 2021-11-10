package chap04.iteration;

// Ű����� while�� ����
public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("-------------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("-------------------------------");
				System.out.print("����: ");
			}
			
			keyCode = System.in.read(); // Ű������ �ڵ带 ����
			
			if(keyCode == 49) { // 1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ� : " + speed);
			}else if(keyCode == 50) { //2�� �о��� ���
				speed--;
				System.out.println("���� �ӵ� : " + speed);
			}else if(keyCode == 51) { // 3�� �о��� ���
				run = false;
			}
		}
		System.out.println("���α׷� ����"); // while���� �����ϱ� ���� run ������ flase�� ����
	}
}
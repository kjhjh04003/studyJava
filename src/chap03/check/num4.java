package chap03.check;

// 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� �� �л��� �� ���� ���� �� �ְ�, ���������� �� ���� �������� ���ϴ� �ڵ�
// ��ĭ�� �� �ڵ� �ֱ�
public class num4 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// �л� �� ���� ������ ���� ��
		// ��ĭ
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// ���� ���� ��
		// ��ĭ
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}

package chap02.type;

//��ȯ���� ���� ������ �ս��� �߻����� �ʵ��� Ȯ��
public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 127;
		
		//if((i<-128) || (i>127))�� ����
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte Ÿ������ ��ȯ�Ҽ� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���");
		}
		else {
			byte b = (byte)i;
			System.out.println(b);
		}
	}
}

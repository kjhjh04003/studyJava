package chap06;

// return ��
public class Car4 {
	// �ʵ�
	int gas;

	// ������

	// �޼ҵ�
	// ���ϰ��� ���� �޼ҵ�� �Ű����� �޾Ƽ� gas �ʵ尪�� ����
	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("������ �����ϴ�.");
			return false;
		}
		System.out.println("������ �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas �ܷ� : " + gas + ")");
				gas -= 1;
			}
			else {
				System.out.println("����ϴ�.(gas �ܷ� : " + gas + ")");
				return; //�޼ҵ� ���� ����
			}
		}
	}

}

package chap06;

// �̱���
public class Singleton {

	// �����ʵ�
	private static Singleton singleton = new Singleton();

	// ������
	private Singleton() {
	}

	static Singleton getInstance() {
		return singleton;
	}

}

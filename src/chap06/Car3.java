package chap06;

// �ٸ� �����ڸ� ȣ���ؼ� �ߺ� �ڵ���ֱ�
public class Car3 {
	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	// ������
	Car3() {

	}

	Car3(String model) {
		this(model, "����", 250); // ������ �������� Car3(String model,String color, int maxSpeed)ȣ��
	}

	Car3(String model, String color) {
		this(model, color, 250); // ������ �������� Car3(String model,String color, int maxSpeed)ȣ��
	}

	// ������� �ڵ�
	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

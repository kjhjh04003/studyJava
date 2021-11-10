package chap06;

// 다른 생성자를 호출해서 중복 코드없애기
public class Car3 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car3() {

	}

	Car3(String model) {
		this(model, "은색", 250); // 마지막 생성자인 Car3(String model,String color, int maxSpeed)호출
	}

	Car3(String model, String color) {
		this(model, color, 250); // 마지막 생성자인 Car3(String model,String color, int maxSpeed)호출
	}

	// 공통실행 코드
	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

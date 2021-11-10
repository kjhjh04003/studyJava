package chap06;

// 메소드 오버로딩
public class Calculator2 {
	// 정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}

	// 직사각형 넓이
	// 정사각형 넓이 구하는 areaRectangle 메소드와 매개변수 개수가 다르다.
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

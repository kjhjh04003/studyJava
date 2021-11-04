package chap03.check;

// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 학생당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지를 구하는 코드
// 빈칸에 들어갈 코드 넣기
public class num4 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수
		// 빈칸
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 수
		// 빈칸
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}

}

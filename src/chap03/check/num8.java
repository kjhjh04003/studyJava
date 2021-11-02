package chap03.check;

// % 연산을 수행한 결과에 10을 더하는 코드
// NaN값을 검사해서 올바른 결과가 출력될 수 있도록 빈칸에 NaN을 검사하는 코드 작성
public class num8 {

	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		
		double z = x % y;
		
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}else {
			double result = z + 10;
			System.out.println("결과 : " + result);
		}
	}

}

package chap03.check;

// 사다리꼴 넓이를 구하는 코드
// 정확히 소숫자리가 나올 수 있도록 빈칸 넣기
public class num6 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		//빈칸
		// 사다리꼴 공식 : (윗+아래)*높이/2
		double area = (double)(lengthTop+lengthBottom)*height/2;
		//double area = (lengthTop+lengthBottom)*height/2.0;
		System.out.println(area);
	}
}

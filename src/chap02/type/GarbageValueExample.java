package chap02.type;

// byte 타입 변수
public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
			
			// 결과
			// byte 변수는 127을 넘어서는 순간 최솟값인 -128부터 다시 저장된다.
		}
		
	}

}

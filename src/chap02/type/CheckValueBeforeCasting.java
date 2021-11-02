package chap02.type;

//변환으로 인한 데이터 손실이 발생되지 않도록 확인
public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 127;
		
		//if((i<-128) || (i>127))과 동일
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		}
		else {
			byte b = (byte)i;
			System.out.println(b);
		}
	}
}

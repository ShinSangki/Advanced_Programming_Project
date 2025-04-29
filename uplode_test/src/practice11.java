//구구단 계산기 만들기 (for문 이용)
public class practice11 {

	public static void main(String[] args) {
		//변수 두개 지정
		int dan, num;
		
		//밖 = 2단~9단(8번 반복), 안 = 1~9(9번 반복)
		for (dan=2; dan<9; dan++) {
			for (num=1; num<=9; num++) {
				System.out.println(dan+"X"+num+"="+(dan*num));
			}
		}
		
	}

}

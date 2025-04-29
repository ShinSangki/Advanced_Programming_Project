//학생들 줄 세우기 (for문 사용)
public class practice13 {

	public static void main(String[] args) {
		// 경우의 수를 구하는 경우? 팩토리얼을 사용 (!기호로 표현)
		// 초깃값 지정
		int fact = 1;
		int friends_num = 5;
		
		// 1부터 5까지 1씩 증가하시켜 fact에 곱하기
		for (int i = 1; i <= friends_num; i++) {
			fact = fact * i;
		}
		System.out.println("A, B, C, D, E 학생들을 순서대로 세우는 경우의 수 : " + fact);

	}

}

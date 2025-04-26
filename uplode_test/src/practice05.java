//편의점의 일일 매출 계산하기
public class practice05 {

	public static void main(String[] args) {
		//총 매출액으로 쓰을 0을 total이라는 변수에 정수형으로 저장.
		int total = 0;
		
		//(구입 물품 가격 * 개수) 를 총 메출액에서 빼기.
		total -= 900*10;
		total -= 3500*5;
		
		//(판매 물품 가격 * 개수) 를 총 매출액에 더하기
		total += 1800*2;
		total += 4000*4;
		total += 1500;
		total += 2000*4;
		total += 1800*5;
		
		//총 매출액 출력
		System.out.println("금일 총매출액은 " + total + "원 입니다.");
		

	}

}

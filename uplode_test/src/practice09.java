//PC방 이용자의 나이 검사하기
import java.util.Scanner;
public class practice09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//나이값을 입력받을 변수 선언 및 저장
		System.out.print("나이 입력 ==> ");
		int age = s.nextInt();
		
		//입력값이 18미만? : 돌아가라는 조건문 작성 + 협조 감사문
		if (age < 18) {
			System.out.println("미성년자는 9시 이후 출입불가!");
		} else {
			System.out.println("즐거운 시간 보내세요!");
		}
		System.out.println("협조 감사드립니다.");
		
		
		
		
		s.close();

	}

}

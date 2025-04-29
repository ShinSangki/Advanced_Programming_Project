//컴퓨터와 숫자 맞히기 게임
import java.util.Scanner;
public class practice14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//컴퓨터와 사용자가 고른 숫자 저장할 변수 선언
		int comp, user;
		
		//(컴퓨터 숫자 선택, 게임의 횟수 출력, 사용자 입력)10회 반복
		for (int i=1; i<=10; i++) {
			comp = (int)(Math.random()*5+1);
			System.out.printf("게임 %d회 : ", i);
			System.out.printf("컴퓨터가 생각한 숫자는?");
			user = s.nextInt();
			
			//정답: for문 탈출, 오답: 반복
			if (comp == user) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.printf("오답입니다...\n", comp);
				continue;
			}
		}
		System.out.println("게임을 종료함.");
		
		
		s.close();
	}

}

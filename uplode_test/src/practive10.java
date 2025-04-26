//컴퓨터와 가위바위보하기
import java.util.Scanner;
public class practive10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//변수 선언, 사용자로부터 입력받고 그 값을 myHand변수에 저장
		String myHand, comHand;
		System.out.print("나의 가위/바위/보 ==> ");
		myHand = s.next();
		
		//컴퓨터의 선택 랜덤으로 추출 후 comHand변수에 저장
		String[] hands = {"가위", "바위", "보"};
		int rnd = (int) (Math.random() * hands.length);
		comHand = hands[rnd];
		
		System.out.println("컴퓨터의 가위/바위/보 ==> " + comHand);
		
		//비교하여 결과 도출하기
		//사용자가 가위를 냈을 경우
		if (myHand.equals("가위")) {
			if (comHand.equals("가위"))
				System.out.println("비겼습니다.");
			else if (comHand.equals("바위"))
				System.out.println("졌습니다.");
			else if (comHand.equals("보"))
				System.out.println("이겼습니다.");
		}
		//사용자가 바위를 냈을경우
		else if (myHand.equals("바위")) {
			if (comHand.equals("가위"))
				System.out.println("이겼습니다.");
			else if (comHand.equals("바위"))
				System.out.println("비겼습니다.");
			else if (comHand.equals("보"))
				System.out.println("졌습니다.");
		}
		//사용자가 보를 냈을경우
		else if (myHand.equals("보")) {
			if (comHand.equals("가위"))
				System.out.println("졌습니다.");
			else if (comHand.equals("바위"))
				System.out.println("이겼습니다.");
			else if (comHand.equals("보"))
				System.out.println("비겼습니다.");
		}
		//이외의 답변을 한 경우
		else {
			System.out.println("당신은 가위바위보의 룰을 잘 모르시는군요!");
		}
		s.close();
	}

}

//컴퓨터와 가위바위보하기
import java.util.Scanner;
public class Ssk20210071_Mid1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//변수 선언, 사용자로부터 입력받고 그 값을 myHand변수에 저장
		String playHand, comHand;
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.print("당신의 선택은? 가위/바위/보 : ");
		playHand = s.next();
		
		//컴퓨터의 선택 랜덤으로 추출 후 comHand변수에 저장
		String[] hands = {"가위", "바위", "보"};
		int rnd = (int) (Math.random() * hands.length);
		comHand = hands[rnd];
		
		System.out.println("컴퓨터의 선택 : " + comHand);
		
		//사용자와 컴퓨터의 값 비교 
		//사용자: if/else, 컴퓨터: switch
		
		//사용자가 가위를 냈을 경우
		if (playHand.equals("가위")) {
			switch (comHand) {
				case "가위":
					System.out.println("비겼습니다.");
					break;
				case "바위":
					System.out.println("당신의 패배입니다.");
		        	break;
				case "보":
					System.out.println("당신의 승리입니다.");
		        	break;
			}
		}
		//사용자가 바위를 냈을경우
		else if (playHand.equals("바위")) {
			switch (comHand) {
				case "가위":
					System.out.println("당신의 승리입니다.");
					break;
				case "바위":
					System.out.println("비겼습니다.");
					break;
				case "보":
					System.out.println("당신의 패배입니다.");
					break;
			}
		}

		//사용자가 보를 냈을경우
		else if (playHand.equals("보")) {
			switch (comHand) {
				case "가위":
					System.out.println("당신의 패배입니다.");
					break;
				case "바위":
					System.out.println("당신의 승리입니다.");
					break;
				case "보":
					System.out.println("비겼습니다.");
					break;
			}
		}
		//이외의 답변을 한 경우
		else {
			System.out.println("'가위', '바위', '보' 를 제외한 단어는 입력할 수 없습니다!");
		}
		System.out.println("가위바위보 게임을 종료합니다.");
		s.close();
	}

}

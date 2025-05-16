import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//변수 선언, 사용자로부터 입력받고 그 값을 myHand변수에 저장
		System.out.print("가위바위보 게임을 시작합니다. \n당신의 선택은? 가위/바위/보 : ");
		String playHand = s.next();
		
		//컴퓨터의 선택 랜덤으로 추출 후 comHand변수에 저장
		int comHand = (int) (Math.random() * 3);
		
		System.out.println("컴퓨터의 선택 : " + comHand);
		
		//사용자와 컴퓨터의 값 비교 
		//사용자: if/else, 컴퓨터: switch
		
		//사용자가 가위를 냈을 경우
		if (playHand.equals("가위")) {
			switch (comHand) {
				case 0:
					System.out.println("컴퓨터의 선택 : 가위\n비겼습니다.");
					break;
				case 1:
					System.out.println("컴퓨터의 선택 : 바위\n당신의 패배입니다.");
		        	break;
				case 2:
					System.out.println("컴퓨터의 선택 : 보\n당신의 승리입니다.");
		        	break;
			}
		}
		//사용자가 바위를 냈을경우
		else if (playHand.equals("바위")) {
			switch (comHand) {
				case 0:
					System.out.println("컴퓨터의 선택 : 가위\n당신의 승리입니다.");
					break;
				case 1:
					System.out.println("컴퓨터의 선택 : 바위\n비겼습니다.");
					break;
				case 2:
					System.out.println("컴퓨터의 선택 : 보\n당신의 패배입니다.");
					break;
			}
		}

		//사용자가 보를 냈을경우
		else if (playHand.equals("보")) {
			switch (comHand) {
				case 0:
					System.out.println("컴퓨터의 선택 : 가위\n당신의 패배입니다.");
					break;
				case 1:
					System.out.println("컴퓨터의 선택 : 바위\n당신의 승리입니다.");
					break;
				case 2:
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

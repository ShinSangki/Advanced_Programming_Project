//컴퓨터와 가위바위보하기
import java.util.Scanner;
public class Ssk20210071_Mid2 {
    
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //변수 선언 및 기본 값 저장
        String playHand, comHand;//사용자&컴퓨터 값
        int playRock = 3, playPaper = 3, playScissors = 3;//사용자 가위/바위/보 횟수 지정
        int comRock = 3, comPaper = 3, comScissors = 3;//컴퓨터 가위/바위/보 횟수 지정
        int Round = 1,  win = 0, lose = 0, draw = 0;//게임 횟수 및 결과를 위한 초기값 저장.
        
        //게임 시작을 알림 + 첫 라운드 출력
        System.out.printf("게임을 시작합니다! %n현재 라운드 : %s%n", Round);
        //각 값의 남은 횟수
        System.out.printf("당신의 남은 횟수 | 가위/바위/보 = %d/%d/%d%n", playScissors, playRock, playPaper);
        System.out.printf("컴퓨터 남은 횟수 | 가위/바위/보 = %d/%d/%d%n", comScissors, comRock, comPaper);
        //Round값이 9와 작거나 같을때 까지만 반복
        while (Round <= 9) {
        	//사용자에게 입력을 받기 위한 내용 출력
        	System.out.printf("당신의 선택은? 가위/바위/보 : ");
        	//사용자의 값 입력
        	playHand = s.next();
        	
        	//랜덤을 위한 hands 배열 선언
        	String[] hands = {"가위", "바위", "보"};
        	//랜덤값으로 컴퓨터의 값 지정
        	while (true) {
        		//0, 1, 2 중 하나의 값을 랜덤 생성후 선택
        	    int rnd = (int) (Math.random() * hands.length);
        	    String tempHand = hands[rnd];
        	    //comHand에 각 값이 1개 이상 남아있으면 break 아니면 다음으로 가는 조건문
        	    if (tempHand.equals("가위") && comScissors > 0) {
        	        comHand = "가위";
        	        break;
        	    } else if (tempHand.equals("바위") && comRock > 0) {
        	        comHand = "바위";
        	        break;
        	    } else if (tempHand.equals("보") && comPaper > 0) {
        	        comHand = "보";
        	        break;
        	    }
        	}

        	System.out.printf("컴퓨터의 선택 : " + comHand + "%n%n");
        	
        	//사용자의 값과 컴퓨터의 값을 통해 비교 후 승패 결정 조건문
        	if (playHand.equals("가위") && playScissors > 0) {
        	    playScissors--; //사용자 가위 횟수 1 차감
        	    switch (comHand) {
        	        case "가위": 
        	        	comScissors--; 
        	        	System.out.println("비겼습니다."); 
        	        	draw++;
        	        	break;
                    case "바위": 
                    	comRock--; 
                    	System.out.println("졌습니다."); 
                    	lose++; 
                    	break;
                    case "보": 
                    	comPaper--; 
                    	System.out.println("이겼습니다."); 
                    	win++; 
                    	break;
        	    }
        	} else if (playHand.equals("바위") && playRock > 0) {
        	    playRock--; //사용자의 바위 횟수 1 차감
        	    switch (comHand) {
                	case "가위": 
                		comScissors--; 
                		System.out.println("이겼습니다."); 
                		win++; 
                		break;
                	case "바위": 
                		comRock--; 
                		System.out.println("비겼습니다."); 
                		draw++; 
                		break;
                	case "보": 
                		comPaper--; 
                		System.out.println("졌습니다."); 
                		lose++;
                		break;
        	    }
        	} else if (playHand.equals("보") && playPaper > 0) {
        	    playPaper--; //사용자의 보 횟수 1 차감
        	    switch (comHand) {
                	case "가위": 
                		comScissors--; 
                		System.out.println("졌습니다."); 
                		lose++; 
                		break;
                	case "바위": 
                		comRock--; 
                		System.out.println("이겼습니다."); 
                		win++; 
                		break;
                	case "보": 
                		comPaper--; 
                		System.out.println("비겼습니다."); 
                		draw++; 
                		break;
        	    }
        	} else {
        	    System.out.println("다시 입력해주세요!");
        	    continue;
        	}

        	// → 여기서 남은 카드 수 출력
        	Round++;
        	
        	if (Round > 9) break;
        	System.out.printf("%n현재 라운드 : %s%n", Round);
        	System.out.printf("당신의 남은 횟수 | 가위/바위/보 = %d/%d/%d%n", playScissors, playRock, playPaper);
        	System.out.printf("컴퓨터 남은 횟수 | 가위/바위/보 = %d/%d/%d%n", comScissors, comRock, comPaper);


            
            
        }
        //최종 출력문
        System.out.println("\n게임이 끝났습니다!");
        System.out.println("");
        System.out.printf("최종 결과! |  승: %d 패: %d 무: %d%n", win, lose, draw);
        

        s.close();
    }
}

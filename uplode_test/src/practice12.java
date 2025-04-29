//같은 숫자가 나올 때까지 주사위 던지기
public class practice12 {

	public static void main(String[] args) {
		//던진횟수, 주사위 3개의 숫자 저장할 변수 지정
		int count = 0;
		int dice1, dice2, dice3;
		
		//주사위 무한 던지기
		while(true) {
			count ++;
			dice1 = (int)(Math.random()*6*1);
			dice2 = (int)(Math.random()*6*1);
			dice3 = (int)(Math.random()*6*1);
			
			if((dice1 == dice2) && (dice2 == dice3))
				break;
		}
		System.out.printf("3개의 주사위는 모두 %d입니다.\n",dice1);
		System.out.printf("같은 숫자가 나올 때까지 %d번 던졌습니다.\n", count);

	}

}

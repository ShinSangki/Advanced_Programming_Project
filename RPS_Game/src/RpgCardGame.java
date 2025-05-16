import java.util.*;

public class RpgCardGame {
    static Map<String, Integer> playerDeck = new HashMap<>();
    static Map<String, Integer> computerDeck = new HashMap<>();
    static int playerWins = 0;
    static int computerWins = 0;
    static int rounds = 0; // 실제 진행된 (승패가 결정된) 라운드 수
    static int displayedRound = 1; // 화면에 표시될 라운드 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initDecks();

        // 승패가 결정되지 않았거나 (총 9 라운드 미만), 플레이어 또는 컴퓨터의 승수가 5 미만일 때 게임을 계속합니다.
        while (rounds < 9 && playerWins < 5 && computerWins < 5) {
            System.out.println("\n[현재 라운드: " + displayedRound + "]");
            System.out.println("플레이어 덱: " + playerDeck);
            System.out.print("카드 선택 (가위/바위/보): ");
            String playerChoice = sc.nextLine().trim();

            if (!playerDeck.containsKey(playerChoice) || playerDeck.get(playerChoice) == 0) {
                System.out.println("해당 카드는 사용할 수 없습니다. 다시 선택해주세요.");
                continue; // 유효하지 않은 입력 시 라운드 정보 변경 없이 재시도
            }

            String computerChoice = getComputerChoice();

            System.out.println("플레이어: " + playerChoice + " / 컴퓨터: " + computerChoice);

            int result = judge(playerChoice, computerChoice);

            // 사용한 카드 차감은 결과와 상관없이 진행됩니다.
            playerDeck.put(playerChoice, playerDeck.get(playerChoice) - 1);
            computerDeck.put(computerChoice, computerDeck.get(computerChoice) - 1);

            if (result == 1) {
                System.out.println("플레이어 승!");
                playerWins++;
                rounds++; // 플레이어 승리 시 실제 라운드 수 증가
                displayedRound++; // 표시될 라운드 수 증가
            } else if (result == -1) {
                System.out.println("컴퓨터 승!");
                computerWins++;
                rounds++; // 컴퓨터 승리 시 실제 라운드 수 증가
                displayedRound++; // 표시될 라운드 수 증가
            } else {
                System.out.println("무승부!");
                // 무승부 시에는 rounds와 displayedRound를 증가시키지 않아 해당 라운드를 다시 진행하는 효과를 줍니다.
            }
        }

        // 최종 결과
        System.out.println("\n--- 게임 종료 ---");
        System.out.println("플레이어 승수: " + playerWins);
        System.out.println("컴퓨터 승수: " + computerWins);
        if (playerWins > computerWins) {
            System.out.println("플레이어 승리!");
        } else if (playerWins < computerWins) {
            System.out.println("컴퓨터 승리!");
        } else {
            System.out.println("무승부입니다!");
        }
    }

    static void initDecks() {
        playerDeck.put("가위", 3);
        playerDeck.put("바위", 3);
        playerDeck.put("보", 3);
        computerDeck.put("가위", 3);
        computerDeck.put("바위", 3);
        computerDeck.put("보", 3);
    }

    static String getComputerChoice() {
        List<String> available = new ArrayList<>();
        // 컴퓨터 덱에 남은 카드만 리스트에 추가합니다.
        for (String card : computerDeck.keySet()) {
            int count = computerDeck.get(card);
            for (int i = 0; i < count; i++) {
                available.add(card);
            }
        }
        
        // 만약 사용 가능한 카드가 없다면 (이 경우는 발생하기 어렵지만 안전을 위해) null을 반환하거나 예외 처리를 할 수 있습니다.
        if (available.isEmpty()) {
            return null; // 또는 다른 처리 방식
        }
        
        Collections.shuffle(available);
        return available.get(0);
    }

    static int judge(String player, String computer) {
        if (player.equals(computer)) return 0; // 무승부
        if ((player.equals("가위") && computer.equals("보")) ||
            (player.equals("바위") && computer.equals("가위")) ||
            (player.equals("보") && computer.equals("바위"))) {
            return 1; // 플레이어 승
        } else {
            return -1; // 컴퓨터 승
        }
    }
}

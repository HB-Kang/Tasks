import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		Random random = new Random(); // 랜덤 함수 라이브러리를 사용
		String[] Game = new String[] { "가위", "바위", "보" }; // 데이터 정의
		
		String input;
		int user = 0, com; // 사용자, 컴퓨터 변수 생성

		while (true) { //사용자가 종료하기 전까지 반복
			System.out.print("가위 바위 보!>>"); //커서를 입력칸 앞으로 이동
		
			input = scanner.nextLine(); // 사용자 입력
			com = random.nextInt(3); // 컴퓨터는 자동으로 3개중에 1개를 랜덤으로 입력.

			if (input.equals("가위")) {user = 0;}         // 사용자 입력을 분석
			else if (input.equals("바위")) {user = 1;}
			else if (input.equals("보")) {user = 2;}
			else if (input.equals("그만")) {break;}       // "그만"을 입력할 시 종료
			else {System.out.println("잘못 입력하셨습니다.");} // 입력 오류 시 재입력
			
			System.out.print("사용자  = " + Game[user] +  ", 컴퓨터  = " + Game[com] + ", ");
			
			if (user == com) System.out.println("비겼습니다."); //승패 판정 후 결과 출력
			if (user == 0) { //사용자가 가위일 때
				if(com == 1) System.out.println("컴퓨터가 이겼습니다.");
				if(com == 2) System.out.println("사용자가 이겼습니다.");
				}
			if (user == 1) { //사용자가 바위일 때
				if(com == 0) System.out.println("사용자가 이겼습니다.");
				if(com == 2) System.out.println("컴퓨터가 이겼습니다.");
				}
			if (user == 2) { //사용자가 보일 때
				if(com == 0) System.out.println("컴퓨터가 이겼습니다.");
				if(com == 1) System.out.println("사용자가 이겼습니다.");
			}
		}
		System.out.println("게임을 종료합니다..."); //게임 종료 메세지 출력
		scanner.close();
	}
}
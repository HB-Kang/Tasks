import java.util.InputMismatchException;
import java.util.Scanner;
public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=0, m=0;
		while(true) { //정상적인 입력이 있을 때까지 무한루프
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				n = scanner.nextInt(); //입력
			}
			catch(InputMismatchException e) { //실수 또는 입력 오류 시 예외 발생 감지
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.next(); //토큰을 제거
				scanner.next(); //토큰을 제거
				continue;
			}
			try {
				m = scanner.nextInt();
			}
			catch(InputMismatchException e) { //실수 또는 입력 오류 시 예외 발생 감지
				System.out.println("실수는 입력하면 안됩니다."); 
				scanner.next(); //토큰을 제거
				continue; //반복 재게
			}
			break; //정상적인 입력으로 반복문 탈출
		}
		System.out.print(n + "x" + m + "=" + n*m);
		scanner.close();
	}
}
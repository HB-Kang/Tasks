import java.util.Scanner;

public class CalculatorSwitch {

	public static double Calculation(double a, String b, double c) {
		double result = 0;

		switch (b) {
		case "+":
			result = a + c;
			break;
		case "-":
			result = a - c;
			break;
		case "*":
			result = a * c;
			break;
		case "/":
			if (c == 0) {      // 0으로 나누는 경우를 배제
				System.out.println("0으로 나눌 수 없습니다.");
				return -1;}
			result = a / c;
			break;
		default: // 연산자를 잘못 입력 했을 시
		return -1;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double result_print = 0;

		System.out.print("연산>>");
		double Operand1 = sc.nextDouble();
		String sign = sc.next();
		double Operand2 = sc.nextDouble();

		result_print = Calculation(Operand1, sign, Operand2);

		if (result_print == -1) {
			System.out.println("입력을 잘못 하셨습니다.");
		} else {
			System.out.println(Operand1 + sign + Operand2 + "의 계산 결과는 " + result_print);
		}

		sc.close();

	}

}

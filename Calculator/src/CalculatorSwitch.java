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
			if (c == 0) {      // 0���� ������ ��츦 ����
				System.out.println("0���� ���� �� �����ϴ�.");
				return -1;}
			result = a / c;
			break;
		default: // �����ڸ� �߸� �Է� ���� ��
		return -1;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double result_print = 0;

		System.out.print("����>>");
		double Operand1 = sc.nextDouble();
		String sign = sc.next();
		double Operand2 = sc.nextDouble();

		result_print = Calculation(Operand1, sign, Operand2);

		if (result_print == -1) {
			System.out.println("�Է��� �߸� �ϼ̽��ϴ�.");
		} else {
			System.out.println(Operand1 + sign + Operand2 + "�� ��� ����� " + result_print);
		}

		sc.close();

	}

}

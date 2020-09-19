import java.util.InputMismatchException;
import java.util.Scanner;
public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=0, m=0;
		while(true) { //�������� �Է��� ���� ������ ���ѷ���
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				n = scanner.nextInt(); //�Է�
			}
			catch(InputMismatchException e) { //�Ǽ� �Ǵ� �Է� ���� �� ���� �߻� ����
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.next(); //��ū�� ����
				scanner.next(); //��ū�� ����
				continue;
			}
			try {
				m = scanner.nextInt();
			}
			catch(InputMismatchException e) { //�Ǽ� �Ǵ� �Է� ���� �� ���� �߻� ����
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�."); 
				scanner.next(); //��ū�� ����
				continue; //�ݺ� ���
			}
			break; //�������� �Է����� �ݺ��� Ż��
		}
		System.out.print(n + "x" + m + "=" + n*m);
		scanner.close();
	}
}
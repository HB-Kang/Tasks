import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		Random random = new Random(); // ���� �Լ� ���̺귯���� ���
		String[] Game = new String[] { "����", "����", "��" }; // ������ ����
		
		String input;
		int user = 0, com; // �����, ��ǻ�� ���� ����

		while (true) { //����ڰ� �����ϱ� ������ �ݺ�
			System.out.print("���� ���� ��!>>"); //Ŀ���� �Է�ĭ ������ �̵�
		
			input = scanner.nextLine(); // ����� �Է�
			com = random.nextInt(3); // ��ǻ�ʹ� �ڵ����� 3���߿� 1���� �������� �Է�.

			if (input.equals("����")) {user = 0;}         // ����� �Է��� �м�
			else if (input.equals("����")) {user = 1;}
			else if (input.equals("��")) {user = 2;}
			else if (input.equals("�׸�")) {break;}       // "�׸�"�� �Է��� �� ����
			else {System.out.println("�߸� �Է��ϼ̽��ϴ�.");} // �Է� ���� �� ���Է�
			
			System.out.print("�����  = " + Game[user] +  ", ��ǻ��  = " + Game[com] + ", ");
			
			if (user == com) System.out.println("�����ϴ�."); //���� ���� �� ��� ���
			if (user == 0) { //����ڰ� ������ ��
				if(com == 1) System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				if(com == 2) System.out.println("����ڰ� �̰���ϴ�.");
				}
			if (user == 1) { //����ڰ� ������ ��
				if(com == 0) System.out.println("����ڰ� �̰���ϴ�.");
				if(com == 2) System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
			if (user == 2) { //����ڰ� ���� ��
				if(com == 0) System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				if(com == 1) System.out.println("����ڰ� �̰���ϴ�.");
			}
		}
		System.out.println("������ �����մϴ�..."); //���� ���� �޼��� ���
		scanner.close();
	}
}
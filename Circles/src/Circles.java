import java.util.Scanner;

public class Circles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� �߽ɰ� ������ �Է�>> "); //������ �����Ͽ� int�� �Է� �޾����� double�ε� ��ü ����
		int XAxis1 = sc.nextInt();
		int YAxis1 = sc.nextInt();
		int Radius1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �߽ɰ� ������ �Է�>> "); //������ �����Ͽ� int�� �Է� �޾����� double�ε� ��ü ����
		int XAxis2 = sc.nextInt();
		int YAxis2 = sc.nextInt();
		int Radius2 = sc.nextInt();
		
        /*
		 �� ���� ��ġ�� �κ��� ����� ���� ������
		'�� ���� �������� ��'>='�� ���� �߽� ������ �Ÿ�'
		  �� �� ������ �Ÿ��� D �� �Ҷ�, D^2=(X1-Y2)^2+(X1-Y2)^2
		(R1+R2)^2 >= D^2 �� ��, R1+R2 >= D �̹Ƿ�
		  ���α׷��� ȿ�� ��, ��Ʈ ������ �����ϰ� ���������� ����ϱ� ���ؼ� �� ���� ������ �� ���·� �� ���� �Ѵ�
		*/
		
		int DistanceSquare = (XAxis1 - XAxis2)*(XAxis1 - XAxis2)+(YAxis1 - YAxis2)*(YAxis1 - YAxis2);
		int SumRadiusSquare = (Radius1+Radius2)*(Radius1+Radius2);
		
		if(SumRadiusSquare>=DistanceSquare)
			System.out.println("�� ���� ���� ��ģ��.");
		else
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		
		sc.close();
	}
}

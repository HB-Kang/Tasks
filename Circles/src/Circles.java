import java.util.Scanner;

public class Circles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>> "); //예제를 참고하여 int로 입력 받았으나 double로도 대체 가능
		int XAxis1 = sc.nextInt();
		int YAxis1 = sc.nextInt();
		int Radius1 = sc.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>> "); //예제를 참고하여 int로 입력 받았으나 double로도 대체 가능
		int XAxis2 = sc.nextInt();
		int YAxis2 = sc.nextInt();
		int Radius2 = sc.nextInt();
		
        /*
		 두 원이 겹치는 부분이 생기기 위한 조건은
		'두 원의 반지름의 합'>='두 원의 중심 사이의 거리'
		  두 점 사이의 거리를 D 라 할때, D^2=(X1-Y2)^2+(X1-Y2)^2
		(R1+R2)^2 >= D^2 일 떄, R1+R2 >= D 이므로
		  프로그램의 효율 상, 루트 연산을 생략하고 정수형으로 계산하기 위해서 양 변에 제곱을 한 상태로 비교 연산 한다
		*/
		
		int DistanceSquare = (XAxis1 - XAxis2)*(XAxis1 - XAxis2)+(YAxis1 - YAxis2)*(YAxis1 - YAxis2);
		int SumRadiusSquare = (Radius1+Radius2)*(Radius1+Radius2);
		
		if(SumRadiusSquare>=DistanceSquare)
			System.out.println("두 원은 서로 겹친다.");
		else
			System.out.println("두 원은 서로 겹치지 않는다.");
		
		sc.close();
	}
}

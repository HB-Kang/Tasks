package NationQuiz1;

import java.util.*;
import java.lang.Math;

class Nation {
	String country;
	String capital;

	public Nation(String country, String capital) {
		this.country = country;
		this.capital = capital;
	}
}

public class NationQuiz1 {
	public static void main(String [] args) {

  Scanner scanner = new Scanner(System.in);
  
  Vector<Nation> v = new Vector<Nation>();  //vector로
  
  //9개의 수도는 미리 입력
  v.add(new Nation("대한민국", "서울"));
  v.add(new Nation("일본", "도쿄"));
  v.add(new Nation("중국", "베이징"));
  v.add(new Nation("러시아", "모스크바"));
  v.add(new Nation("베트남", "하노이"));
  v.add(new Nation("미국", "워싱턴"));
  v.add(new Nation("호주", "캔버라"));
  v.add(new Nation("영국", "런던"));
  v.add(new Nation("프랑스", "파리"));
  
  System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
  for(;;) {
   System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
   int start = scanner.nextInt();
   if(start==3) {
    System.out.println("게임을 종료합니다.");
    return;
   }
   else if(start==1) {           //입력
    System.out.println("현재 "+v.size()+"개 나라와 수도가 입력되어 있습니다.");
    for(;;) {
     System.out.print("나라와 수도 입력"+(v.size()+1)+">> ");
     String country = scanner.next();
     if(country.equals("그만")) break;
     else {
      String capital = scanner.next();
      Nation add = new Nation(country, capital);
      v.add(add);
      for(int i=0;i<v.size()-1;i++) {
       if(v.get(i).country.equals(country)) {
        System.out.println(country+"는 이미 있습니다!");
        v.remove(v.size()-1); //오기입 된 것은 삭제
        break;}
      }
     } 
    }
   }
   else if(start==2) {   //퀴즈
    for(;;) {
    int n = (int)(Math.random()*v.size());
    Nation nation = v.get(n);
    System.out.print(nation.country+"의 수도는? ");
    String answer = scanner.next();
    
    if(answer.equals("그만")) break;
    if(nation.capital.equals(answer)) System.out.println("정답!!");
    else System.out.println("아닙니다!!");
    }
   } 
   
   else {
   System.out.println("잘못 입력하셨습니다.");
   }
   
  }
}
}
   
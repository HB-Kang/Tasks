package NationQuiz2;
import java.util.*;

public class NationQuiz2 {
 public static void main(String [] args) {
	 
  Scanner scanner = new Scanner(System.in);
  
  HashMap<String, String> h = new HashMap<String, String>(); //hashmap으로
  
  //9개의 수도는 미리 입력
  h.put("대한민국", "서울");
  h.put("일본", "도쿄");
  h.put("중국", "베이징");
  h.put("러시아", "모스크바");
  h.put("베트남", "하노이");
  h.put("미국", "워싱턴");
  h.put("호주", "캔버라");
  h.put("영국", "런던");
  h.put("프랑스", "파리");
 
  System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
  Set<String> keys = h.keySet();
  Iterator<String> it = keys.iterator();
  
  for(;;) {
   System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
   int start = scanner.nextInt();
   if(start==3) {
    System.out.println("게임을 종료합니다.");
    return;
   }
   else if(start==1) {  //입력
    System.out.println("현재 "+h.size()+"개 나라와 수도가 입력되어 있습니다.");
    for(;;) {
     System.out.print("나라와 수도 입력"+(h.size()+1)+">> ");
     String country = scanner.next();
     if(country.equals("그만")) break;
     else {
      String capital = scanner.next();
      if(h.containsKey(country)) {
       System.out.println(country+"는 이미 있습니다!");
      }
      else {
       h.put(country, capital);
       keys = h.keySet();
       it = keys.iterator();
      }
     }
    }
   }
   else { //퀴즈
    for(;;) {
    String quiz = it.next();
    System.out.print(quiz+"의 수도는? ");
    String answer = scanner.next();
    if(answer.equals("그만")) break;
    else if(h.get(quiz).equals(answer)) System.out.println("정답!!");
    else System.out.println("아닙니다!!");
    }
   } 
  }
}
}
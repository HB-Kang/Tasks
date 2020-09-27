import java.util.InputMismatchException; 
import java.util.Scanner; 

public class ConcertReservation { 
    public static void main(String[] args) {  
           
       String Seat[] = new String[30];  // 30개의 좌석 설정

       for (int i = 0; i < 30; i++) { // 배열의 기본값을 "---"로 초기화
           Seat[i] = "---"; 
       } 
	   String Type[] = { "S", "A", "B" };
       String input = null; 
       Scanner scanner = new Scanner(System.in); 
       System.out.println("명품콘서트홀 예약 시스템입니다.");
       while (true) { 
             System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>"); 
             input = scanner.next(); 
             if ("1".equals(input)) {   // 예약
                   while (true) { 
                         try { 
                               System.out.print("좌석 구분 S(1), A(2), B(3)>>"); 
                               int typenum = scanner.nextInt(); 
                               if (typenum==1 && typenum==2 && typenum==3) { 
                                     System.out.println("없는 좌석 타입입니다."); 
                                     continue;
                              }
                               System.out.print(Type[typenum-1] + ">> ");
                               for (int i = 0; i < 10; i++) { 
                            	   System.out.print(Seat[(typenum-1)*10 + i] + " ");
                               } 
                               System.out.print("\n");
                               System.out.print("이름>>"); 
                               String name = scanner.next();
                               System.out.print("번호>>"); 
                               int num = scanner.nextInt(); 
                               if (num <= 0 || num > 10) { 
                                     System.out.println("없는 좌석 번호입니다."); 
                                     continue; 
                              } 
                              if (Seat[(typenum-1)*10+num-1] != "---") { 
                                    System.out.println("이미 예약된 좌석입니다."); 
                                    continue; 
                             } 
                         Seat[(typenum-1)*10+num-1] = name;
                         break; 
                     } catch (InputMismatchException e) { 
                         System.out.println("잘못된 입력.");
                         break;
                  } 
              } 
          } else if ("2".equals(input)) {  // 조회 
              System.out.print("S>> ");
              for (int i = 0; i < 10; i++) { 
           	  System.out.print(Seat[i] + " ");
              }
              System.out.print("\n");
              System.out.print("A>> ");
              for (int i = 0; i < 10; i++) { 
           	  System.out.print(Seat[i+10] + " ");
              }
              System.out.print("\n");
              System.out.print("B>> ");
              for (int i = 0; i < 10; i++) { 
           	  System.out.print(Seat[i+20] + " ");
              }
              System.out.println("\n<<<조회를 완료하였습니다.>>>");
              
          } else if ("3".equals(input)) {  // 취소
        	  try {
                  System.out.print("좌석 S:1, A:2, B:3>>"); 
                  int typenum = scanner.nextInt(); 
                  if (typenum==1 && typenum==2 && typenum==3) { 
                        System.out.println("없는 좌석 타입입니다."); 
                        continue; 
                 }
                  System.out.print(Type[typenum-1] + ">> ");
                  for (int i = 0; i < 10; i++) { 
               	   System.out.print(Seat[(typenum-1)*10 + i] + " ");
                  } 
                  System.out.print("/n이름>>"); 
                  String name = scanner.next();
                  int count = 0;
                  for (int i = 0; i < 10; i++) { 
                	  if (Seat[(typenum-1)*10+i].equals(name)) { 
                		  Seat[(typenum-1)*10+i] = "---";
                		  count++;
                      }
                  }
                  if (count==0) System.out.println("일치하는 이름이 없습니다.");
                  count = 0;
        	  } catch (InputMismatchException e) { 
                  System.out.println("잘못된 입력.");
                  break;
           } 
          } else if ("4".equals(input)) { 
              System.out.println("종료합니다."); 
              break; 
          } else { 
              System.out.println("잘못된 입력."); 
          } 
      } 
      scanner.close(); 
  } 
} 

import java.util.InputMismatchException; 
import java.util.Scanner; 

public class ConcertReservation { 
    public static void main(String[] args) {  
           
       String Seat[] = new String[30];  // 30���� �¼� ���� �� �ʱ�ȭ

       for (int i = 0; i < 30; i++) { 
           Seat[i] = "---"; 
       } 
	   String Type[] = { "S", "A", "B" };
       String input = null; 
       Scanner scanner = new Scanner(System.in); 
       System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
       while (true) { 
             System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>"); 
             input = scanner.next(); 
             if ("1".equals(input)) { 
                   // ���� 
                   while (true) { 
                         try { 
                               System.out.print("�¼� ���� S(1), A(2), B(3)>>"); 
                               int typenum = scanner.nextInt(); 
                               if (typenum==1 && typenum==2 && typenum==3) { 
                                     System.out.println("���� �¼� Ÿ���Դϴ�."); 
                                     continue;
                              }
                               System.out.print(Type[typenum-1] + ">> ");
                               for (int i = 0; i < 10; i++) { 
                            	   System.out.print(Seat[(typenum-1)*10 + i] + " ");
                               } 
                               System.out.print("\n");
                               System.out.print("�̸�>>"); 
                               String name = scanner.next();
                               System.out.print("��ȣ>>"); 
                               int num = scanner.nextInt(); 
                               if (num <= 0 || num > 10) { 
                                     System.out.println("���� �¼� ��ȣ�Դϴ�."); 
                                     continue; 
                              } 
                              if (Seat[(typenum-1)*10+num-1] != "---") { 
                                    System.out.println("�̹� ����� �¼��Դϴ�."); 
                                    continue; 
                             } 
                         Seat[(typenum-1)*10+num-1] = name;
                         break; 
                     } catch (InputMismatchException e) { 
                         System.out.println("�߸��� �Է�.");
                         break;
                  } 
              } 
          } else if ("2".equals(input)) { 
              // ��ȸ 
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
              System.out.print("\n");
              System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
              
          } else if ("3".equals(input)) { 
              // ��� 
        	  try {
                  System.out.print("�¼� S:1, A:2, B:3>>"); 
                  int typenum = scanner.nextInt(); 
                  if (typenum==1 && typenum==2 && typenum==3) { 
                        System.out.println("���� �¼� Ÿ���Դϴ�."); 
                        continue; 
                 }
                  System.out.print(Type[typenum-1] + ">> ");
                  for (int i = 0; i < 10; i++) { 
               	   System.out.print(Seat[(typenum-1)*10 + i] + " ");
                  } 
                  System.out.print("\n");
                  System.out.print("�̸�>>"); 
                  String name = scanner.next();
                  int count = 0;
                  for (int i = 0; i < 10; i++) { 
                	  if (Seat[(typenum-1)*10+i].equals(name)) { 
                		  Seat[(typenum-1)*10+i] = "---";
                		  count++;
                      }
                  }
                  if (count==0) System.out.println("��ġ�ϴ� �̸��� �����ϴ�.");
                  count = 0;
        	  } catch (InputMismatchException e) { 
                  System.out.println("�߸��� �Է�.");
                  break;
           } 
          } else if ("4".equals(input)) { 
              System.out.println("�����մϴ�."); 
              break; 
          } else { 
              System.out.println("�߸��� �Է�."); 
          } 
      } 
      scanner.close(); 
  } 
} 
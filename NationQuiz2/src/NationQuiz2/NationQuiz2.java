package NationQuiz2;
import java.util.*;

public class NationQuiz2 {
 public static void main(String [] args) {
	 
  Scanner scanner = new Scanner(System.in);
  
  HashMap<String, String> h = new HashMap<String, String>(); //hashmap����
  
  //9���� ������ �̸� �Է�
  h.put("���ѹα�", "����");
  h.put("�Ϻ�", "����");
  h.put("�߱�", "����¡");
  h.put("���þ�", "��ũ��");
  h.put("��Ʈ��", "�ϳ���");
  h.put("�̱�", "������");
  h.put("ȣ��", "ĵ����");
  h.put("����", "����");
  h.put("������", "�ĸ�");
 
  System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
  Set<String> keys = h.keySet();
  Iterator<String> it = keys.iterator();
  
  for(;;) {
   System.out.print("�Է�:1, ����:2, ����:3>> ");
   int start = scanner.nextInt();
   if(start==3) {
    System.out.println("������ �����մϴ�.");
    return;
   }
   else if(start==1) {  //�Է�
    System.out.println("���� "+h.size()+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
    for(;;) {
     System.out.print("����� ���� �Է�"+(h.size()+1)+">> ");
     String country = scanner.next();
     if(country.equals("�׸�")) break;
     else {
      String capital = scanner.next();
      if(h.containsKey(country)) {
       System.out.println(country+"�� �̹� �ֽ��ϴ�!");
      }
      else {
       h.put(country, capital);
       keys = h.keySet();
       it = keys.iterator();
      }
     }
    }
   }
   else { //����
    for(;;) {
    String quiz = it.next();
    System.out.print(quiz+"�� ������? ");
    String answer = scanner.next();
    if(answer.equals("�׸�")) break;
    else if(h.get(quiz).equals(answer)) System.out.println("����!!");
    else System.out.println("�ƴմϴ�!!");
    }
   } 
  }
}
}
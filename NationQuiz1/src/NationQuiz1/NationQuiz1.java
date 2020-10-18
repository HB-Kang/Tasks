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
  
  Vector<Nation> v = new Vector<Nation>();  //vector��
  
  //9���� ������ �̸� �Է�
  v.add(new Nation("���ѹα�", "����"));
  v.add(new Nation("�Ϻ�", "����"));
  v.add(new Nation("�߱�", "����¡"));
  v.add(new Nation("���þ�", "��ũ��"));
  v.add(new Nation("��Ʈ��", "�ϳ���"));
  v.add(new Nation("�̱�", "������"));
  v.add(new Nation("ȣ��", "ĵ����"));
  v.add(new Nation("����", "����"));
  v.add(new Nation("������", "�ĸ�"));
  
  System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
  for(;;) {
   System.out.print("�Է�:1, ����:2, ����:3>> ");
   int start = scanner.nextInt();
   if(start==3) {
    System.out.println("������ �����մϴ�.");
    return;
   }
   else if(start==1) {           //�Է�
    System.out.println("���� "+v.size()+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
    for(;;) {
     System.out.print("����� ���� �Է�"+(v.size()+1)+">> ");
     String country = scanner.next();
     if(country.equals("�׸�")) break;
     else {
      String capital = scanner.next();
      Nation add = new Nation(country, capital);
      v.add(add);
      for(int i=0;i<v.size()-1;i++) {
       if(v.get(i).country.equals(country)) {
        System.out.println(country+"�� �̹� �ֽ��ϴ�!");
        v.remove(v.size()-1); //������ �� ���� ����
        break;}
      }
     } 
    }
   }
   else if(start==2) {   //����
    for(;;) {
    int n = (int)(Math.random()*v.size());
    Nation nation = v.get(n);
    System.out.print(nation.country+"�� ������? ");
    String answer = scanner.next();
    
    if(answer.equals("�׸�")) break;
    if(nation.capital.equals(answer)) System.out.println("����!!");
    else System.out.println("�ƴմϴ�!!");
    }
   } 
   
   else {
   System.out.println("�߸� �Է��ϼ̽��ϴ�.");
   }
   
  }
}
}
   
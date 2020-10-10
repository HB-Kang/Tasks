package Gambling;

import java.util.Scanner;

class Person {
	private String name;
	private int random[] = new int[3];

	Person(String name) {
		this.name = name;
	}

	boolean game() {

		System.out.print("\t");

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 3 + 1);
			System.out.print(random[i] + " ");
		}

		if (random[0] == random[1] && random[0] == random[2]) {
			System.out.println(name + "님이 이겼습니다!");
			return true;
		} else {
			System.out.println("아쉽군요!");
			return false;
		}
	}

	public String getName() {
		return name;
	}
}

public class Gamble {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		Person p[] = new Person[2];
		
		for (int i =0; i<p.length; i++) {
			System.out.print(i+1 + "번째 선수 이름>>");
			p[i] = new Person(sc1.next());
			sc1.nextLine();
		}
		
		boolean win = false;
		boolean roop = true;
		
		while(roop) {
		for (int i =0; i<p.length; i++) {
			System.out.print("[" + p[i].getName() + "]:");
			System.out.print("<Enter>");
			sc2.nextLine();
			
			win = p[i].game();
			if(win == true) roop = false;
		}

	}
		sc1.close();
		sc2.close();
}
}
package Searching;

import java.io.*;
import java.util.*;

public class Searching {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		
		File file = new File(scanner.next());
		
		scanner.nextLine();
		
		try {

			for (;;) {
				Scanner hScanner = new Scanner(new FileInputStream(file),"UTF-8"); // �����ڵ� ���ڵ�
				int linenumber = 1;
				System.out.print("�˻��� �ܾ ����>> ");
				String search = scanner.nextLine();
				if (search.equals("�׸�")) {
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
				
				while (hScanner.hasNext()) {
					String line = hScanner.nextLine();
					if (line.contains(search)) {
						System.out.println(linenumber + ":" + line);
					}
					linenumber++;
				}
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("����");
		}
		scanner.close();
	}
}
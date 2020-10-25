package Searching;

import java.io.*;
import java.util.*;

public class Searching {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		
		File file = new File(scanner.next());
		
		scanner.nextLine();
		
		try {

			for (;;) {
				Scanner hScanner = new Scanner(new FileInputStream(file),"UTF-8"); // 유니코드 인코딩
				int linenumber = 1;
				System.out.print("검색할 단어나 문장>> ");
				String search = scanner.nextLine();
				if (search.equals("그만")) {
					System.out.println("프로그램을 종료합니다.");
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
			System.out.println("오류");
		}
		scanner.close();
	}
}
package step7;

import java.util.Scanner;

public class B1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 단어의 개수
		sc.nextLine();
		int count = num; // 그룹 단어 개수
		
		for(int i = 0; i < num; i++) { // 단어 개수만큼 실행
			String s = sc.nextLine();
			
			for(int j = 0; j < s.length(); j++) { // 첫번째 알파벳부터 검사
				char c = s.charAt(j); // 첫번째 알파벳 c
				int check = s.indexOf(c); // c와 같은 알파벳의 index 리턴
				int ncheck; // c와 같은 알파벳의 index2 리턴
				if(check >= 0) { // 존재할때만 실행
					s = s.replaceFirst(String.valueOf(c), " "); // c를 " "로 치환
					ncheck = s.indexOf(c); // c를 " "로 치환한 후 또 c가 존재하는지 검사
					if(ncheck != -1 && ncheck-1 != check) { // 존재한다면 이전 index값이랑 1차이인지 검사
						count--; // 1차이가 아닐때
						break;
					}
				}
			}
		}
		System.out.println(count);
	}

}

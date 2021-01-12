package step7;

import java.util.Scanner;

public class B2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int count = 0; // 알파벳 수
		String[] c = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="}; 
		// 배열에 치환할 크로아티아 알파벳 저장
		// ! 주의할 점 dz= 가 z= 보다 먼저 저장되어야 함
		
		for(int i = 0; i < c.length; i++) { // 입력받은 s에 크로아티아 알파벳 있는지 검사
			while(s.contains(c[i])) { // s에 c[i] 문자열이 포함되었는지 확인
				s = s.replaceFirst(c[i], " "); 
				// c[i]를 " "로 치환 
				// ! 주의할 점 ""이면 앞뒤 문자가 합쳐져 크로아티아알파벳이 될 수도 있어서 " " 띄어쓰기 필요
				count++;
			}
		}
		s = s.replace(" ", ""); // 치환된 " " 를 삭제
		count += s.length(); // 남은 알파벳들 개수를 더함

		System.out.println(count);
		
	}

}

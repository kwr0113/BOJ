package step7;

import java.util.Scanner;

public class B10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int[] array = new int [26]; // 알파벳 배열
		
		for(int i = 0; i < array.length; i++) { // -1로 초기화
			array[i] = -1;
		}

		for(int i = 0; i < s.length(); i++) {
			int num = s.charAt(i)-97; // 'a'의 아스키코드가 97이라. a는 배열의 0번째
			if(array[num] >= 0) { // 이미 값이 있으면 continue
				continue;
			}
			array[num] = i; // 해당 알파벳 배열에 알파벳 위치를 저장
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}

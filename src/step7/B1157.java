package step7;

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int[] array = new int [26]; // 알파벳 배열
		
		for(int i = 0; i < array.length; i++) { // 0으로 초기화
			array[i] = 0;
		}

		for(int i = 0; i < s.length(); i++) {
			int num = s.charAt(i) < 91 ? s.charAt(i)-65 : s.charAt(i)-97;
			// 'A' 아스키코드 65, 'a' 97이라. Aa는 배열의 0번째
			array[num]++; // 해당 알파벳 배열++
		}
		
		int max = array[0];
		int maxnum = 0;
		char result = 0;
		
		for(int i = 0; i < array.length; i++) { // 가장 많은 횟수 max에 저장
			max = max > array[i] ? max : array[i];
			maxnum = max > array[i] ? maxnum : i;
		}
		for(int i = 0; i < array.length; i++) { // 가장 많은 횟수가 여러개인지 검사
			if(max == array[i] && maxnum != i) { // 중복일 경우 ? 저장
				result = '?';
				break;
			} else {
				result = (char) (maxnum+65); // 대문자 출력하기위해 +65
			}
		}
		
		System.out.println(result);

	}

}

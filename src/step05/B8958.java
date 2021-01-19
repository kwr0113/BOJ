package step05;

import java.util.Scanner;

public class B8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		String[] str = new String[num];
		int score = 1; // O가 몇개인지 따라 바뀌는 점수
		int[] total = new int[num]; // 총 점수 기록하는 변수
		
		for(int i = 0; i < num; i++) {
			
			str[i] = sc.next();
			
			for(int j = 0; j < str[i].length(); j++) {
				char c = str[i].charAt(j);
				if (c == 'O') {
					total[i] += score++; // O가 연속될수록 score++해줌
				} else if (c == 'X') {
					score = 1; // O가 끊기고 X가 나오면 score 1로 초기화
				}		
			}
			score = 1;
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(total[i]);
		}

	}

}

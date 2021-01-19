package step04;

import java.io.*;
import java.util.Scanner;

public class B1110 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 입력값
		int count = 0; // 횟수 세는 카운트
		int result;
		
		int input = num;
		
		while(true) {
			if(input < 10) { // 한자리수일때
				result = input * 10 + input; // 0 붙이고 두번째자리, 각 자리수 더한 결과값의 두번째자리 합친 결과
			} else {
				result = (input % 10) * 10 + (((input / 10) + (input % 10)) % 10);
				// 결과 = 첫 입력값 두번째자리, 두 자리수 더한 값 두번째자리 합친 결과
				// 첫 입력값 두번째자리 = 입력값 % 10
				// 두 자리수 더한 값 두번째자리 = ( 입력값 / 10 + 입력값 % 10 ) % 10
			}
			count++;
			if(num == result) {
				System.out.println(count);
				return;
			} else {
				input = result;
			}
		}
	}

}

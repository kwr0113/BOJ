package step07;

import java.util.Scanner;

public class B11720 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String para = sc.next();
		int total = 0;

		for(int i = 0; i < num; i++) {
			total += Character.getNumericValue(para.charAt(i));		
		}
		
		System.out.println(total);
	}
}

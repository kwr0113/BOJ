package step08;

import java.util.Scanner;

public class B2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int five = n / 5;
		int three = n % 5 / 3;
		
		int total = 5 * five + 3 * three;
		
		while(total != n) {
			five--;
			three = ( n - (5 * five) ) / 3;
			total = 5 * five + 3 * three;
			if(five < 0) {
				five = 0;
				three = -1;
				break;
			}
		}	
		System.out.println(five + three);
	}
}

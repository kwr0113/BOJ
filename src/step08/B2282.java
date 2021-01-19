package step08;

import java.util.Scanner;

public class B2282 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = 1;
		int num = 1;
		
		while(true) {
			if(a <= num) {
				System.out.println(n);
				break;
			} else {
				num += 6 * n++;
			}		
		}	
	}
}

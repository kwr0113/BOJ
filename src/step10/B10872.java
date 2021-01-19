package step10;

import java.util.Scanner;

public class B10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 1;
		
		if(n == 0) {
			System.out.println("1");
		} else {
			for(int i = 1; i <= n; i++) {
				a = a * i;
			}
			System.out.println(a);
		}
	}
}

package step8;

import java.util.Scanner;

public class B1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int xis = 1;
		int n = 1;
		
		Loop1 :
		while(true) {
			for(int i = 1; i <= n; i++) {
				if(x == xis) {
					if(n % 2 == 0) {
						System.out.println( i + "/" + (n-i+1) );
					} else {
						System.out.println( (n-i+1) + "/" + i );
					}
					break Loop1;
				}else {
					xis++;
				}
			}
			n++;
		}
	}
}

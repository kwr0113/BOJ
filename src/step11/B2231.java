package step11;

import java.util.Scanner;

public class B2231 {
	
	static int nm(int n, int l) {
		int m = n;
		for(int i = 0; i < l; i++) {
			m += n % 10;
			n /= 10;
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = Integer.toString(n).length();
		
		for(int i = 1; i <= n; i++) {
			if(n == nm(i, l)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("0");
	}
}

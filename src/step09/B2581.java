package step09;

import java.util.Scanner;

public class B2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int prime[] = new int[1300];
		int primeIdx = 1;
		prime[0] = 2;
		prime[1] = 3;
		
		Loop1 :
		for(int i = 4; i <= 10000; i++) {
			for(int j = 0; j < primeIdx; j++) {
				if(i % prime[j] == 0) {
					continue Loop1;
				} else {
					
				}
			}
			prime[++primeIdx] = i;
		}
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int min = 0;
		int total = 0;
		
		for(int i = m; i <= n; i++) {
			for(int j = 0; j <= primeIdx; j++) {
				if(prime[j] == i) {
					min = min == 0 ? prime[j] : min;
					total += prime[j];
				}
			}
		}
		
		if(min == 0) {
			System.out.println("-1");
		} else {
			System.out.println(total);
			System.out.println(min);
		}
	}
}

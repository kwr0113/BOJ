package step09;

import java.util.Scanner;

public class B1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int count = 0;
		
		int prime[] = new int[200];
		int primeIdx = 1;
		prime[0] = 2;
		prime[1] = 3;
		
		Loop1 :
		for(int i = 4; i <= 1000; i++) {
			for(int j = 0; j < primeIdx; j++) {
				if(i % prime[j] == 0) {
					continue Loop1;
				} else {
					
				}
			}
			prime[++primeIdx] = i;
		}
		
		for(int i = 0; i < t; i++) {
			int num = sc.nextInt();
			for(int j = 0; j <= primeIdx; j++) {
				if(prime[j] == num) {
					count++;
					break;
				}
			}
		}

		System.out.println(count);
	}
}

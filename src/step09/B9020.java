package step09;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B9020 {
	
	static int isPrime(int[] a, int length, int num) {
		for(int i = 0; i < length; i++) {
			if(a[i]==num)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = sc.nextInt();
		
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
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int num1 = -1;
			int num2 = -1;
			
			for(int j = 0; j < n / 2; j++) {
				num1 = isPrime(prime, primeIdx, (n/2)-j);
				num2 = isPrime(prime, primeIdx, (n/2)+j);
				if ( num1 != -1 && num2 != -1) {
					break;
				}
			}
			bw.write(prime[num1] + " " + prime[num2]);
			bw.newLine();
		}
		bw.flush();
	}
}

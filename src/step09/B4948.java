package step09;

import java.io.*;
import java.util.Scanner;

public class B4948 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 1;
		
		while(true) {
			n = sc.nextInt();
			if(n == 0) {
				break;
			}
			int m = 2 * n;
			int count = 0;
			
			int sqrt = (int)(Math.sqrt(m) + 1);
			
			int[] prime = new int[m+1];
			
			for(int i = 2; i <= sqrt; i++) {
				for(int j = i; j <= m; j+=i) {
					if (prime[j] == 0 && j != i) {
						prime[j] = -1;
					}
				}
			}
			
			for(int i = n+1; i < prime.length; i++) {
				if(i != 1 && prime[i] != -1) {
					count++;
				}
			}
			bw.write(count + "\n");		
			
		}
		
		bw.flush();
	}
}

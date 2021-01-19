package step09;

import java.io.*;
import java.util.StringTokenizer;

public class B1929 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());	
		
		int sqrt = (int)(Math.sqrt(n) + 1);
		
		int[] prime = new int[n+1];
		
		for(int i = 2; i <= sqrt; i++) {
			for(int j = i; j <= n; j+=i) {
				if (prime[j] == 0 && j != i) {
					prime[j] = -1;
				}
			}
		}
		
		for(int i = m; i < prime.length; i++) {
			if(i != 1 && prime[i] != -1) {
				bw.write(i + "\n");
			}
		}
		bw.flush();
	}
}

package step11;

import java.io.*;
import java.util.StringTokenizer;

public class B2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] array = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		for(int i = 0; i < n; i ++) {
			for(int j = i+1; j < n; j++) {
				for(int k = j+1; k < n; k++) {
					int a = array[i]+array[j]+array[k];
					max = a <= m && a > max ? a : max;
				}
			}
		}
		System.out.println(max);
	}
}

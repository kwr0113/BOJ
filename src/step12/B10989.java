package step12;

import java.io.*;
import java.util.Scanner;

public class B10989 {

	static void countingSort(int[] a, int n) {
		int max = a[0];
		for(int i = 0; i < n; i++) {
			if(a[i] > max)
				max = a[i];
		}
		
		int[] counting = new int[max+1];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) counting[a[i]]++;
		for(int i = 1; i <= max; i++) counting[i] += counting[i-1];
		for(int i = n-1; i >= 0; i--) b[--counting[a[i]]] = a[i];
		for(int i = 0; i < n; i++) a[i] = b[i];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] sort = new int[n];
		
		for(int i = 0; i < n; i++) {
			sort[i] = Integer.parseInt(br.readLine());
		}
		
		countingSort(sort, n);

		for(int i = 0; i < n; i++) {
			bw.write(Integer.toString(sort[i]) +"\n");
		}
		bw.flush();
	}

}

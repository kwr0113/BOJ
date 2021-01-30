package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1427 {
	
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

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int[] num = new int[s.length()];

		for(int i = 0; i < num.length; i++) {
			num[i] = Character.getNumericValue(s.charAt(i));
		}
		
		countingSort(num, num.length);
		
		for(int i = num.length-1; i >= 0; i--) {
			System.out.print(num[i]);
		}
	}
}

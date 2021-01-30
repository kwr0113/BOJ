package step12;

import java.io.*;

public class B2108 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] sort = new int[n];
		double total = 0;
		
		for(int i = 0; i < n; i++) {
			sort[i] = Integer.parseInt(br.readLine());
			total += sort[i];
		}
		
		int max = sort[0];
		int min = sort[0];
		for(int i = 0; i < n; i++) {
			if(sort[i] > max)
				max = sort[i];
			if(sort[i] < min)
				min = sort[i];
		}
		
		int i1 = (int)Math.round(total / n);	// »ê¼úÆò±Õ
		int i2 = 0;								// Áß¾Ó°ª
		int i3 = 0; 							// ÃÖºó°ª
		int i4 = max - min;;					// ¹üÀ§
		
		int[] count = new int[i4+1];
		int[] b = new int[n];
		
		for(int i = 0; i < sort.length; i++) {
			count[sort[i] - min]++;
		}
		
		int num = 1;
		int mode_idx = 0;
		for(int i = 0; i < count.length; i++) {
			if(count[mode_idx] == count[i] && num == 1) {
				mode_idx = i;
				num++;
			}
			if(count[mode_idx] < count[i] && count[mode_idx] != count[i]) {
				mode_idx = i;
				num = 1;
			}
		}
		i3 = mode_idx+min;
		
		for(int i = 1; i < i4+1; i++) {
			count[i] += count[i-1];
		}
		for(int i = n-1; i >= 0; i--) {
			b[--count[sort[i] - min]] = sort[i];
		}
		for(int i = 0; i < n; i++) sort[i] = b[i];

		i2 = sort[n/2];				
						
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
	}
}

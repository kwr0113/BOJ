package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11650_1 {
	
	static int[][] buff;
	
	static void mergeSortX(int[][] a, int left, int right) {
		if(left < right) {
			int i;
			int center = (left + right) /2;
			int p = 0;
			int j = 0;
			int k = left;
			
			mergeSortX(a, left, center);
			mergeSortX(a, center + 1, right);
			
			for(i = left; i <= center; i++) {
				buff[p][0] = a[i][0];
				buff[p++][1] = a[i][1];
			}

			while(i <= right && j < p) {
				a[k][0] = (buff[j][0] <= a[i][0]) ? buff[j][0] : a[i][0];
				a[k++][1] = (buff[j][0] <= a[i][0]) ? buff[j++][1] : a[i++][1];
			}
					
			while(j < p) {
				a[k][0] = buff[j][0];
				a[k++][1] = buff[j++][1];
			}
		}
	}
	
	static void mergeSortY(int[][] a, int left, int right) {
		if(left < right) {
			int i;
			int center = (left + right) /2;
			int p = 0;
			int j = 0;
			int k = left;
			
			mergeSortY(a, left, center);
			mergeSortY(a, center + 1, right);
			
			for(i = left; i <= center; i++) {
				buff[p][0] = a[i][0];
				buff[p++][1] = a[i][1];
			}

			while(i <= right && j < p) {
				a[k][0] = (buff[j][1] <= a[i][1]) ? buff[j][0] : a[i][0];
				a[k++][1] = (buff[j][1] <= a[i][1]) ? buff[j++][1] : a[i++][1];
			}
					
			while(j < p) {
				a[k][0] = buff[j][0];
				a[k++][1] = buff[j++][1];
			}
		}
	}
	
	static void mergeSort(int[][] a, int n) {
		buff = new int[n][2];
		mergeSortX(a, 0, n-1);
		
		int left = 0, right = 0;
		for(int i = 0; i < n-1; i++) {
			if(a[i][0] != a[i+1][0]) {
				right = i;
				mergeSortY(a, left, right);
				left = i+1;
			}
		}
		mergeSortY(a, left, n-1);
		buff = null;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] xy = new int[n][2];
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			xy[i][0] = Integer.parseInt(st.nextToken());
			xy[i][1] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(xy, n);
		
		for(int i = 0; i < n; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}
}

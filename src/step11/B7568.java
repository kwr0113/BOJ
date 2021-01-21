package step11;

import java.io.*;
import java.util.StringTokenizer;

public class B7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		int[][] array = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			int count = 1;
			for(int j = 0; j < n; j++) {
				if(i == j) {
					continue;
				} else if(array[j][0] > array[i][0] && array[j][1] > array[i][1])
					count++;
			}
			System.out.print(count + " ");
		}
	}
}

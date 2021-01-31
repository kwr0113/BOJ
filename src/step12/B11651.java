package step12;

import java.io.*;
import java.util.*;

public class B11651 {

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
		
		Arrays.sort(xy, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]){
		            return o1[0] - o2[0];
		        }else{
		            return o1[1] - o2[1];
		        }
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(xy[i][0] + " " + xy[i][1]);
		}
	}

}

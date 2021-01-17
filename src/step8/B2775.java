package step8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B2775 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = sc.nextInt();
		int[][] array = new int[15][15];
		
		for(int i = 1; i < 15; i++) {
			array[i][1] = 1;
			array[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				array[i][j] = array[i-1][j] + array[i][j-1];
			}
		}
		
		for(int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			bw.write(array[k][n] + "\n");
		}
		
		bw.flush();
	}
}

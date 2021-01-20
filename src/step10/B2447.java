package step10;

import java.io.*;
import java.util.Scanner;

public class B2447 {
	
	static void Star(String[][] star, int n, int x, int y) {
		if(n == 3) {
			for(int i = x; i < x+3; i ++) {
				for(int j = y; j < y+3; j ++) {
					star[i][j] = "*";
				}
			}
			star[x+1][y+1] = " ";
		} else {
			int count = 0;
			for(int i = x; i < x + n; i += n/3) {
				for(int j = y; j < y + n; j += n/3) {
					if(count == 4) {
						Blank(star, n/3, i, j);
					} else {
						Star(star, n/3, i, j);
					}
					count++;
				}
			}
		}	
	}
	
	static void Blank(String[][] star, int n, int x, int y) {
		for(int i = x; i < x + n; i ++) {
			for(int j = y; j < y + n; j ++) {
				star[i][j] = " ";
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = sc.nextInt();
		if(n == 1) {
			System.out.println("*");
			return;
		}
		
		String[][] star = new String[n][n];
		
		Star(star, n, 0, 0);		
			
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j ++) {
				bw.write(star[i][j]);
			}
			bw.newLine();
		}
		
		bw.flush();
	}
}

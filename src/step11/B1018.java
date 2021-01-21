package step11;

import java.io.*;
import java.util.StringTokenizer;

public class B1018 {
	
	static int board(char[][] myBoard, int x, int y) {
		char[][] BBoard = {
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
		};
		char[][] WBoard = {
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
		};
		int countB = 0;
		int countW = 0;
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(BBoard[i][j] != myBoard[x + i][y + j]) {
					countB++;
				}
				if(WBoard[i][j] != myBoard[x + i][y + j]) {
					countW++;
				}
			}
		}
		return Math.min(countW, countB);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char[][] myBoard = new char[n][m];
	
		
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			for(int j = 0; j < m; j++) {
				myBoard[i][j] = s.charAt(j);
			}
		}
		
		int min = board(myBoard, 0, 0);
		
		for(int i = 0; i <= n - 8; i++) {
			for(int j = 0; j <= m - 8; j++) {
				min = min < board(myBoard, i, j) ? min : board(myBoard, i, j);
			}
		}	
		System.out.println(min);
	}
}

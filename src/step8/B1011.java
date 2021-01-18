package step8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B1011 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int distance = y - x;
			
			int root = (int)Math.sqrt(distance);
			if(distance - Math.pow(root, 2) == 0) {
				count = 2 * root -1;
			} else if(distance - Math.pow(root, 2) <= root) {
				count = 2 * root;
			} else {
				count = 2 * root + 1;
			}
			
			bw.write(Integer.toString(count));
			bw.newLine();
		}
		
		bw.flush();
	}
}

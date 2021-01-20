package step10;

import java.io.*;
import java.util.Scanner;

public class B11725 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static void Hanoi(int n, int start, int middle, int goal ) throws IOException {
		if(n == 1){
			bw.write(start + " " + goal + "\n");
		} else {
			Hanoi(n-1, start, goal, middle);
			bw.write(start + " " + goal + "\n");
			Hanoi(n-1, middle, start, goal);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		bw.write((int)Math.pow(2, n) - 1 + "\n");
		Hanoi(n, 1, 2, 3);
		bw.flush();
	}

}

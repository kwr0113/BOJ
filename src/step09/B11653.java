package step09;

import java.io.*;
import java.util.Scanner;

public class B11653 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int a = 2;	
		
		while(n != 1) {
			if(n % a == 0) {
				n /= a;
				bw.write(a + "\n");
			} else {
				a++;
			}
		}
		bw.flush();
	}
}

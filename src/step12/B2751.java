package step12;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class B2751 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = sc.nextInt();
		int[] sort = new int[n];
		
		for(int i = 0; i < n; i++) {
			sort[i] = sc.nextInt();
		}
		
		Arrays.sort(sort);
		
		for(int i = 0; i < n; i++) {
			bw.write(Integer.toString(sort[i]) +"\n");
		}
		bw.flush();
	}
}

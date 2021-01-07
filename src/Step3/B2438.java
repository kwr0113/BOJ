package Step3;

import java.io.*;
import java.util.StringTokenizer;

public class B2438 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < (num+1); i++) {
			
			int t = num - i;
			for(int k = 0 ; k < t; k++) {
				bw.write(" ");
			}
			
			for(int j = 0; j < i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();

	}

}

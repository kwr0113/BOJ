package step03;

import java.io.*;

public class B2439 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) {
			
			for(int k = 1 ; k <= num - i; k++) {
				bw.write(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();

	}

}


package step07;

import java.io.*;
import java.util.StringTokenizer;


public class B1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			count++;
		}
		
		System.out.println(count);

	}

}

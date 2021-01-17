package step8;

import java.io.*;
import java.util.StringTokenizer;

public class B2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		double dayd = (double)( v - b ) / (double)( a - b ) ;
		int dayi = (int)Math.ceil(dayd);
		
		System.out.println(dayi);
	}
}

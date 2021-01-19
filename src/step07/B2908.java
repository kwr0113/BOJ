package step07;

import java.io.*;
import java.util.StringTokenizer;

public class B2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		StringBuffer sb = new StringBuffer();

		sb.append(st.nextToken());
		String a = sb.reverse().toString();
		sb.setLength(0);
		sb.append(st.nextToken());
		String b = sb.reverse().toString();
		
		if(Integer.parseInt(a) > Integer.parseInt(b)) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		

	}

}

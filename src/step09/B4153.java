package step09;

import java.io.*;
import java.util.StringTokenizer;

public class B4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = -1;
		int b = -1;
		int c = -1;
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0 ) {
				break;
			}
			int temp;
			
			if(a > b && a > c) {
				temp = a;
				a = c;
				c = temp;
			} else if ( b > a && b > c) {
				temp = b;
				b = c;
				c = temp;
			}
			
			if(Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
				bw.write("right\n");
			}else {
				bw.write("wrong\n");
			}
		}
		bw.flush();
	}
}

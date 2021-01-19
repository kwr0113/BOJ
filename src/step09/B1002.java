package step09;

import java.io.*;
import java.util.StringTokenizer;

public class B1002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			int distance = (int)((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)));
			int add = (int) Math.pow(r1 + r2, 2);
			int sub = (int) Math.pow(r1 - r2, 2);
			
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				bw.write("-1\n");
			} else if ( distance > add || distance < sub) {
				bw.write("0\n");
			} else if ( distance == add || distance == sub) {
				bw.write("1\n");
			} else if ( sub > distance || distance < add ){
				bw.write("2\n");
			}
		}
		bw.flush();
	}
}

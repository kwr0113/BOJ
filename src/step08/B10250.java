package step08;

import java.io.*;
import java.util.StringTokenizer;

public class B10250 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			
			if(n%h == 0) {
				bw.write(Integer.toString(h));
				bw.write(String.format("%02d", n/h));
			} else {
				bw.write(Integer.toString(n%h));
				bw.write(String.format("%02d", n/h+1));
			}
			bw.newLine();
		}
		bw.flush();
	}
}

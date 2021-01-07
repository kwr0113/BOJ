package Step3;

import java.io.*;
import java.util.StringTokenizer;

public class B10871 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(st2.nextToken());
			if(a < x) {
				bw.write(a + " ");
			}
		}
		
		bw.flush();
		bw.close();
	}

}

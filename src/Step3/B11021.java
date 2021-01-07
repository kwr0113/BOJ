package Step3;

import java.io.*;
import java.util.StringTokenizer;

public class B11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int c = a+b;
			bw.write("Case #" + (i+1) + ": " + c + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}

package step7;

import java.io.*;

public class B5622 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int count = 0; // 총 시간
		int num = 0; // 각 숫자 시간
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case 'A': case 'B': case 'C': { 
				num = 3; count += num; break; } // 3초
			case 'D': case 'E': case 'F': { 
				num = 4; count += num; break; } // 4초
			case 'G': case 'H': case 'I': { 
				num = 5; count += num; break; } // 5초
			case 'J': case 'K': case 'L': { 
				num = 6; count += num; break; } // 6초
			case 'M': case 'N': case 'O': { 
				num = 7; count += num; break; } // 7초
			case 'P': case 'Q': case 'R': case 'S': { 
				num = 8; count += num; break; } // 8초
			case 'T': case 'U': case 'V': {
				num = 9; count += num; break; } // 9초
			case 'W': case 'X': case 'Y': case 'Z': { 
				num = 10; count += num; break; } // 10초
			default: { 
				num = 0; break; }
			}
		}
		
		System.out.println(count);

	}

}

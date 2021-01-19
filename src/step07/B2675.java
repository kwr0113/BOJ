package step07;

import java.io.*;
import java.util.StringTokenizer;

public class B2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine()); // 테스트케이스 개수
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken()); // 반복할 횟수 r
			String s = st.nextToken(); // 반복할 문자 s

			for(int j = 0; j < s.length(); j++) { // s의 길이만큼 수행
				for(int k = 0; k < r; k++) { // s를 하나씩 잘라서 r만큼 버퍼에 입력해줌
					bw.write(s.charAt(j));
				}
			}
			bw.newLine(); // s 입력 후에 개행
		}
		bw.flush();
		bw.close();
	}

}

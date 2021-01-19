package step07;

import java.io.*;
import java.util.StringTokenizer;

public class B2675 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine()); // �׽�Ʈ���̽� ����
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken()); // �ݺ��� Ƚ�� r
			String s = st.nextToken(); // �ݺ��� ���� s

			for(int j = 0; j < s.length(); j++) { // s�� ���̸�ŭ ����
				for(int k = 0; k < r; k++) { // s�� �ϳ��� �߶� r��ŭ ���ۿ� �Է�����
					bw.write(s.charAt(j));
				}
			}
			bw.newLine(); // s �Է� �Ŀ� ����
		}
		bw.flush();
		bw.close();
	}

}

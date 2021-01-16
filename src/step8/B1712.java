package step8;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1712 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		String c = st.nextToken();
		
		int d = (int) (Double.parseDouble(a) / ( Double.parseDouble(c) - Double.parseDouble(b) )) + 1;

		if(d < 1) {
			System.out.println("-1");
		} else {
			System.out.println(d);
		}
	}
}

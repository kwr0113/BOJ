package step12;

import java.io.*;
import java.util.*;

public class B1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] word = new String[n];

		for(int i = 0; i < n; i++) {
			word[i] = br.readLine();
		}
		
		Arrays.sort(word, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length())
					return -1;
				else if(o1.length() == o2.length())
					return o1.compareTo(o2);
				else
					return 1;
			}
		});
		
		for(int i = 0; i < n; i++) {
			if(i != 0 && word[i].equals(word[i-1]))
				continue;
			System.out.println(word[i]);
		}
	}

}

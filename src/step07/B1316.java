package step07;

import java.util.Scanner;

public class B1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		int count = num;
		
		for(int i = 0; i < num; i++) {
			String s = sc.nextLine();
			
			for(int j = 0; j < s.length(); j++) { 
				char c = s.charAt(j);
				s = s.replaceFirst(String.valueOf(c), " ");
				int check = s.indexOf(c);
				if(check != -1 && check-1 != j) {
					count--;
					break;
				}
			}
		}
		System.out.println(count);
	}


}

package step11;

import java.util.Scanner;

public class B1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 0;
		int count = 0;
		while(true) {
			i++;
			if(Integer.toString(i).contains("666")) {
				count++;
			}
			if(count == n) {
				break;
			}
		}
		System.out.println(i);
	}
}

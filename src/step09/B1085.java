package step09;

import java.util.Scanner;

public class B1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int minW = Math.min(x , w - x);
		int minH = Math.min(y , h - y);
 
		System.out.println(Math.min(minW, minH));
	}

}

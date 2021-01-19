package step10;

import java.util.Scanner;

public class B10870 {

	static int Fibonacci (int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			return Fibonacci(num-1) + Fibonacci(num-2);
		}	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(Fibonacci(n));
	}
}

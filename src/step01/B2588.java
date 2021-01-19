package step01;
import java.util.Scanner;

public class B2588 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		multi(a,b);
				
	}
	
	public static void multi(int num1, int num2) {
		
		String num = Integer.toString(num2);
		char a = num.charAt(2);
		char b = num.charAt(1);
		char c = num.charAt(0);
		
		System.out.println(num1 * Character.getNumericValue(a));
		System.out.println(num1 * Character.getNumericValue(b));
		System.out.println(num1 * Character.getNumericValue(c));
		System.out.println(num1 * num2);
		
		return;
	}

}

package step3;
import java.util.Scanner;

public class B2738 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0; i < 9; i++) {
			System.out.println(a + " * " + (i+1) + " = " + a*(i+1));
		}

	}

}

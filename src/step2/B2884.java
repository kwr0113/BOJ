package step2;
import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if ( m >= 45 && h != 0 ) {
			System.out.println( h + " " + ( m-45 ) );
		} else if ( m < 45 && h != 0 ) {
			System.out.println( (h-1) + " " + ( 15+m ) );
		} else if ( m >= 45 && h == 0 ) {
			System.out.println( 23 + " " + ( m-45 ) );
		} else if ( m < 45 && h == 0 ) {
			System.out.println( 23 + " " + ( 15+m ) );
		}

	}

}

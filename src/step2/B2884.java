package step2;
import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int time = h * 60 + m - 45;
		
		if ( time >= 0 ) {
			System.out.println( (time/60) + " " + (time%60) );
		} else if ( time < 0 ) {
			System.out.println("23 " + (15+m) );
		}

	}

}

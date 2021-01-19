package step05;

import java.util.Scanner;

public class B2577 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int num = a * b * c;
		
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		
		while(true) {

			switch(num % 10) {
				case 0: count[0]++; break;
				case 1: count[1]++; break;
				case 2: count[2]++; break;
				case 3: count[3]++; break;
				case 4: count[4]++; break;
				case 5: count[5]++; break;
				case 6: count[6]++; break;
				case 7: count[7]++; break;
				case 8: count[8]++; break;
				case 9: count[9]++; break;
			}
			if(num / 10 == 0) {
				break;
			}
			num /= 10;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(count[i]);
		}

	}

}

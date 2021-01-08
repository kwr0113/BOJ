package step5;

import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] array = new int[num];
		
		int count = 0;
		
		for(count = 0; count < num; count++) {
			array[count] = sc.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		
		count = 0;

		while(count < num) {
			min = min < array[count] ? min : array[count];
			count++;
		}
		
		count = 0;
		
		while(count < num) {
			max = max > array[count] ? max : array[count];
			count++;
		}
		
		System.out.println(min + " " + max);
	}

}

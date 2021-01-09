package step5;

import java.util.Scanner;

public class B2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[9];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int max = array[0];
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			max = max > array[i] ? max : array[i];
			count = max > array[i] ? count : i;
		}
		
		System.out.println(max);
		System.out.println(count+1);

	}

}

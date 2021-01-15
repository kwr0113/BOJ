package step5;

import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] array = new int[num];
		
		for(int i = 0; i < num; i++) {
			array[i] = sc.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		
		for(int i = 0; i < num; i++) {
			min = min < array[i] ? min : array[i];
			max = max > array[i] ? max : array[i];
		}
		
		System.out.println(min + " " + max);
	}

}

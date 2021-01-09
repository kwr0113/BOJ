package step5;

import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		double[] score = new double[num];
		double[] nscore = new double[num];
		double maxScore = 0;
		double total = 0;
		
		for(int i = 0; i < num; i++) {
			score[i] = sc.nextInt();
			maxScore = maxScore > score[i] ? maxScore : score[i];
		}
		
		for(int i = 0; i < num; i++) {
			nscore[i] = (score[i] * 100 / maxScore);
			total += nscore[i];
		}
		
		System.out.println(total / num);
	}

}

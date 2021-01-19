package step05;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B4344 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = sc.nextInt(); // 총 테스트케이스 개수
		
		for(int i = 0; i < num; i++) {
			int snum = sc.nextInt(); // 학생의 수
			int count = 0; // 평균 넘는 학생의 수
			double total = 0; // 학생의 점수 총합
			double[] score = new double[snum]; // 각각 학생의 점수 배열 학생 수만큼
			for(int j = 0; j < snum; j++) {
				score[j] = sc.nextInt(); // 점수 입력받고
				total += score[j];		 // 바로 총 합에 더함
			}
			double avg = (double)total / (double)snum; // 총 합을 학생수로 나누어 평균 계산
			for(int j = 0; j < snum; j++) { 
				if(score[j] > avg) { // 평균보다 높은 점수 가진 학생 수 카운트
					count++;
				}
			}
			double ratio = ((double)count / (double)snum) * 100 ; // 비율 계산
			String s = String.format("%.3f", ratio); // 소수점 셋째자리까지만 출력
			bw.write(s + "%\n");
		}

		bw.flush();
		bw.close();
	}

}

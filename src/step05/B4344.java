package step05;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B4344 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = sc.nextInt(); // �� �׽�Ʈ���̽� ����
		
		for(int i = 0; i < num; i++) {
			int snum = sc.nextInt(); // �л��� ��
			int count = 0; // ��� �Ѵ� �л��� ��
			double total = 0; // �л��� ���� ����
			double[] score = new double[snum]; // ���� �л��� ���� �迭 �л� ����ŭ
			for(int j = 0; j < snum; j++) {
				score[j] = sc.nextInt(); // ���� �Է¹ް�
				total += score[j];		 // �ٷ� �� �տ� ����
			}
			double avg = (double)total / (double)snum; // �� ���� �л����� ������ ��� ���
			for(int j = 0; j < snum; j++) { 
				if(score[j] > avg) { // ��պ��� ���� ���� ���� �л� �� ī��Ʈ
					count++;
				}
			}
			double ratio = ((double)count / (double)snum) * 100 ; // ���� ���
			String s = String.format("%.3f", ratio); // �Ҽ��� ��°�ڸ������� ���
			bw.write(s + "%\n");
		}

		bw.flush();
		bw.close();
	}

}

package step04;

import java.io.*;
import java.util.Scanner;

public class B1110 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // �Է°�
		int count = 0; // Ƚ�� ���� ī��Ʈ
		int result;
		
		int input = num;
		
		while(true) {
			if(input < 10) { // ���ڸ����϶�
				result = input * 10 + input; // 0 ���̰� �ι�°�ڸ�, �� �ڸ��� ���� ������� �ι�°�ڸ� ��ģ ���
			} else {
				result = (input % 10) * 10 + (((input / 10) + (input % 10)) % 10);
				// ��� = ù �Է°� �ι�°�ڸ�, �� �ڸ��� ���� �� �ι�°�ڸ� ��ģ ���
				// ù �Է°� �ι�°�ڸ� = �Է°� % 10
				// �� �ڸ��� ���� �� �ι�°�ڸ� = ( �Է°� / 10 + �Է°� % 10 ) % 10
			}
			count++;
			if(num == result) {
				System.out.println(count);
				return;
			} else {
				input = result;
			}
		}
	}

}

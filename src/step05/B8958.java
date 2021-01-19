package step05;

import java.util.Scanner;

public class B8958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		String[] str = new String[num];
		int score = 1; // O�� ����� ���� �ٲ�� ����
		int[] total = new int[num]; // �� ���� ����ϴ� ����
		
		for(int i = 0; i < num; i++) {
			
			str[i] = sc.next();
			
			for(int j = 0; j < str[i].length(); j++) {
				char c = str[i].charAt(j);
				if (c == 'O') {
					total[i] += score++; // O�� ���ӵɼ��� score++����
				} else if (c == 'X') {
					score = 1; // O�� ����� X�� ������ score 1�� �ʱ�ȭ
				}		
			}
			score = 1;
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(total[i]);
		}

	}

}

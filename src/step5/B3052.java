package step5;

import java.util.Scanner;

public class B3052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];
		int[] array2 = new int[10];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
			array2[i] = array[i] % 42;
		}
		
		for(int i = 0; i < 10; i++) {
			if(array2[i] < 0) {
				continue;
			}
			for(int j = 0; j < 10; j++) {
				if(i == j) { // �ڽŰ� �ڽ��� ������ �ʵ���
					continue;
				} else if(array2[j] == array2[i]) { // ���� ���� ���� ��� -1�� ���� ����
					array2[j] = -1;
				}
			}
		}
		for(int i = 0; i < 10; i++) {
			if(array2[i] >= 0) {
				count++;
			}
		}

		System.out.println(count);

	}

}

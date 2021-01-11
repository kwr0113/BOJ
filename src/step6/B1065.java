package step6;

import java.util.Scanner;

public class B1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0; // �Ѽ� ���� ī��Ʈ
		
		for(int i = 1; i <= num; i++) {
			if(xIs(i)) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	static boolean xIs (int n) {
		
		boolean b = false; // �Ѽ��� true ��ȯ
		int[] array = new int[3];
		
		if(n < 100) { // 1 ~ 99
			b = true;
		} else if(n < 1000) { // 100 ~ 999
			array[0] = n / 100; // ù��°�ڸ�
			array[1] = n / 10  % 10; // �ι�°�ڸ�
			array[2] = n % 100 % 10; // ����°�ڸ�
			
			if(array[2]-array[1] == array[1]-array[0]) // ���� ��
				b = true;
			
		} else { // 1000
			b = false;
		}	
		return b;
	}

}

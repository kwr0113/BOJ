package step7;

import java.util.Scanner;

public class B10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int[] array = new int [26]; // ���ĺ� �迭
		
		for(int i = 0; i < array.length; i++) { // -1�� �ʱ�ȭ
			array[i] = -1;
		}

		for(int i = 0; i < s.length(); i++) {
			int num = s.charAt(i)-97; // 'a'�� �ƽ�Ű�ڵ尡 97�̶�. a�� �迭�� 0��°
			if(array[num] >= 0) { // �̹� ���� ������ continue
				continue;
			}
			array[num] = i; // �ش� ���ĺ� �迭�� ���ĺ� ��ġ�� ����
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}

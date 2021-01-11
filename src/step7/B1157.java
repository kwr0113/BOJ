package step7;

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int[] array = new int [26]; // ���ĺ� �迭
		
		for(int i = 0; i < array.length; i++) { // 0���� �ʱ�ȭ
			array[i] = 0;
		}

		for(int i = 0; i < s.length(); i++) {
			int num = s.charAt(i) < 91 ? s.charAt(i)-65 : s.charAt(i)-97;
			// 'A' �ƽ�Ű�ڵ� 65, 'a' 97�̶�. Aa�� �迭�� 0��°
			array[num]++; // �ش� ���ĺ� �迭++
		}
		
		int max = array[0];
		int maxnum = 0;
		char result = 0;
		
		for(int i = 0; i < array.length; i++) { // ���� ���� Ƚ�� max�� ����
			max = max > array[i] ? max : array[i];
			maxnum = max > array[i] ? maxnum : i;
		}
		for(int i = 0; i < array.length; i++) { // ���� ���� Ƚ���� ���������� �˻�
			if(max == array[i] && maxnum != i) { // �ߺ��� ��� ? ����
				result = '?';
				break;
			} else {
				result = (char) (maxnum+65); // �빮�� ����ϱ����� +65
			}
		}
		
		System.out.println(result);

	}

}

package step7;

import java.util.Scanner;

public class B1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // �ܾ��� ����
		sc.nextLine();
		int count = num; // �׷� �ܾ� ����
		
		for(int i = 0; i < num; i++) { // �ܾ� ������ŭ ����
			String s = sc.nextLine();
			
			for(int j = 0; j < s.length(); j++) { // ù��° ���ĺ����� �˻�
				char c = s.charAt(j); // ù��° ���ĺ� c
				int check = s.indexOf(c); // c�� ���� ���ĺ��� index ����
				int ncheck; // c�� ���� ���ĺ��� index2 ����
				if(check >= 0) { // �����Ҷ��� ����
					s = s.replaceFirst(String.valueOf(c), " "); // c�� " "�� ġȯ
					ncheck = s.indexOf(c); // c�� " "�� ġȯ�� �� �� c�� �����ϴ��� �˻�
					if(ncheck != -1 && ncheck-1 != check) { // �����Ѵٸ� ���� index���̶� 1�������� �˻�
						count--; // 1���̰� �ƴҶ�
						break;
					}
				}
			}
		}
		System.out.println(count);
	}

}

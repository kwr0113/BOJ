package step7;

import java.util.Scanner;

public class B2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int count = 0; // ���ĺ� ��
		String[] c = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="}; 
		// �迭�� ġȯ�� ũ�ξ�Ƽ�� ���ĺ� ����
		// ! ������ �� dz= �� z= ���� ���� ����Ǿ�� ��
		
		for(int i = 0; i < c.length; i++) { // �Է¹��� s�� ũ�ξ�Ƽ�� ���ĺ� �ִ��� �˻�
			while(s.contains(c[i])) { // s�� c[i] ���ڿ��� ���ԵǾ����� Ȯ��
				s = s.replaceFirst(c[i], " "); 
				// c[i]�� " "�� ġȯ 
				// ! ������ �� ""�̸� �յ� ���ڰ� ������ ũ�ξ�Ƽ�ƾ��ĺ��� �� ���� �־ " " ���� �ʿ�
				count++;
			}
		}
		s = s.replace(" ", ""); // ġȯ�� " " �� ����
		count += s.length(); // ���� ���ĺ��� ������ ����

		System.out.println(count);
		
	}

}

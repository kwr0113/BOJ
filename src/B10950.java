import java.util.Scanner;

public class B10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[][] array = new int[a][2];
		
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i][0] + array[i][1]);
		}

	}

}

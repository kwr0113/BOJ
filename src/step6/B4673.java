package step6;

public class B4673 {

	public static void main(String[] args) {
		
		boolean[] array = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int num = d(i);

			if(num < 10001) {
				array[num] = true;
			}
		}
		
		for(int i = 1; i < 10001; i++ ) {
			if(array[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int a) {
		int result = a + a % 10 + a % 100 / 10 + a % 1000 / 100 + a % 10000 / 1000;	
		return result;
	}

}

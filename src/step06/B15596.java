package step06;

public class B15596 {
	
	long sum(int[] a) {
		long total = 0;
		
		for(int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
	}

}

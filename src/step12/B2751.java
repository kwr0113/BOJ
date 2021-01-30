package step12;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B2751 {
	
	static int[] buff;
	
	static void mergeSort(int[] a, int left, int right) {
		if(left < right) {
			int i;
			int center = (left + right) /2;
			int p = 0;
			int j = 0;
			int k = left;
			
			mergeSort(a, left, center);
			mergeSort(a, center + 1, right);
			
			for(i = left; i <= center; i++)
				buff[p++] = a[i];

			while(i <= right && j < p)
				a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
					
			while(j < p)
				a[k++] = buff[j++];
		}
	}
	
	static void mergeSort(int[] a, int n) {
		buff = new int[n];
		mergeSort(a, 0, n-1);
		buff = null;
	}
	
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void downHeap(int[] a, int left, int right) {
		int temp = a[left];
		int child;
		int parent;
		
		for(parent = left; parent <(right+1)/2; parent = child) {
			int cl = parent * 2 +1;
			int cr = cl + 1;
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl;
			if(temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}
	
	static void heapSort(int[] a, int n) {
		for(int i = (n-1)/2; i >= 0; i--)
			downHeap(a, i, n - 1);
		
		for(int i = n-1; i > 0; i--) {
			swap(a, 0, i);
			downHeap(a, 0, i-1);
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = sc.nextInt();
		int[] sort = new int[n];
		
		for(int i = 0; i < n; i++) {
			sort[i] = sc.nextInt();
		}
		
		mergeSort(sort, n);
		//heapSort(sort, n);
		
		
		for(int i = 0; i < n; i++) {
			bw.write(Integer.toString(sort[i]) +"\n");
		}
		bw.flush();
	}
}

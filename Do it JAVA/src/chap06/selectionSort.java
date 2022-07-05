package chap06;

import java.util.Scanner;

public class selectionSort {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;

	}

	static void selectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min  = j;
				} 
			}
			swap(a,i,min);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("버블 정렬 (버전 1)");
		System.out.print("요솟수 : ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		selectionSort(a, n);

		System.out.println("오름차순으로 정렬했습니다.");

		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] : " + a[i]);
		}

	}

}

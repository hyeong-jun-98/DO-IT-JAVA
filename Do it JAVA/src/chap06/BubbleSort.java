package chap06;

import java.util.Scanner;

public class BubbleSort {

	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	/*static void bubbleSort(int[] a, int n) {			// ���� 1
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
				}
			}
		}
	}*/
	
	static void bubbleSort(int[] a, int n) {			// ���� 2
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
			} 
			if(exchg == 0) {
				break;
			}
		}
	}

	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� (���� 1)");
		System.out.print("��ڼ� : ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		bubbleSort(a, n);

		System.out.println("������������ �����߽��ϴ�.");

		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] : " + a[i]);
		}
	}

}

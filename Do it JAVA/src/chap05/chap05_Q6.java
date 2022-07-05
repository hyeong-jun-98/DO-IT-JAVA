package chap05;

import java.util.Scanner;

public class chap05_Q6 {
	static String[] name = { "A ���", "B ���", "C ���" };

	static void hanoi(int num, int start, int finish) {

		if (num > 1) {
			hanoi(num - 1, start, 6 - start - finish);
		}

		System.out.println("����[" + num + "]�� " + name[start - 1] + "��տ��� " + name[finish - 1] + "������� �ű�.");

		if (num > 1) {
			hanoi(num - 1, 6 - start - finish, finish);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ϳ����� ž");
		System.out.print("���ݰ��� : ");
		int num = sc.nextInt();

		hanoi(num, 1, 3);

	}

}

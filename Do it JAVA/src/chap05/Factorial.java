package chap05;
import java.util.Scanner;

public class Factorial {

	static int factorial(int n) {
		if (n > 0) {
			return n * factorial(n - 1);
		} else
			return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		System.out.print(num + "�� ���丮���� " + factorial(num) + "�Դϴ�.");

	}

}
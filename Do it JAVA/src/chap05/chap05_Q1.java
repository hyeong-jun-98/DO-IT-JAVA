package chap05;

import java.util.Scanner;

public class chap05_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num  == 0) {
			System.out.println("1");
		} else {
			for(int i = 1; i <= num; i++) {
				result *= i;
			}
		}
		System.out.println(num + "�� ���丮���� " + result + "�Դϴ�. ");
		
		
		
	}

}

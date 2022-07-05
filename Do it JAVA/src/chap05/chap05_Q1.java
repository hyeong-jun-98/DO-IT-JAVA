package chap05;

import java.util.Scanner;

public class chap05_Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num  == 0) {
			System.out.println("1");
		} else {
			for(int i = 1; i <= num; i++) {
				result *= i;
			}
		}
		System.out.println(num + "의 팩토리얼은 " + result + "입니다. ");
		
		
		
	}

}

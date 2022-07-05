package chap05;
import java.util.Scanner;
public class Hanoi {

	static void hanoi(int num, int start, int finish) {
		if(num > 1) {
			hanoi(num - 1, start, 6 - start - finish);
		}
		System.out.println("원반[" + num + "]을 " + start + "기둥에서 " + finish + "기둥으로 옮김.");
		
		if(num > 1) {
			hanoi(num - 1, 6 - start - finish, finish);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반개수 : ");
		int num = sc.nextInt();
		
		hanoi(num, 1, 3);
		
	}

}

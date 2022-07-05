package chap05;
import java.util.Scanner;
public class Hanoi {

	static void hanoi(int num, int start, int finish) {
		if(num > 1) {
			hanoi(num - 1, start, 6 - start - finish);
		}
		System.out.println("����[" + num + "]�� " + start + "��տ��� " + finish + "������� �ű�.");
		
		if(num > 1) {
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

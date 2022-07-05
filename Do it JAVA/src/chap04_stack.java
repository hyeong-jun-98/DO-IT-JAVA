import java.util.Scanner;

class IntStack {
	private int max;
	private int num;
	private int[] que;

	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	public IntStack(int capacity) {
		num = 0;
		max = capacity; // �뷮
		try {
			que = new int[max];

		} catch (OutOfMemoryError e) {
			max = 0;
		}

	}

	public int enqueue(int x) throws OverflowIntStackException {

		if (num >= max) {
			throw new OverflowIntStackException();
		} else {
			x = que[num++];
		}
		return x;
	}

	public int dequeue() throws EmptyIntStackException {
		if (num <= 0) {
			throw new EmptyIntStackException();
		} else {
			int x = que[0];
			for (int i = 0; i < num - 1; i++) {
				que[i] = que[i + 1];
			}
			num--;
			return x;

		}
	}

	public int peek() throws EmptyIntStackException {
		int x = 0;
		if (num <= 0) {
			throw new EmptyIntStackException();
		} else {
			x = que[num-1];
		} return x;
	}

	public void dump() {

	}

	public int size() {
		return num;
	}
	public int capacity() {
		return num;
	}
}
public class chap04_stack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(5);

		while (true) {

			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity());
			System.out.print("(1)Ǫ��  (2)��  (3)��ũ (4)����  (5)�ʱ�ȭ  (6)�뷮  (7)ũ��  (0)���� : ");

			int menu = sc.nextInt();
			if (menu == 0) {
				System.out.println("���� �Ǿ����ϴ�.");
				break;
			}

			int x;
			switch (menu) {
			case 1:
				System.out.print("������ :");
				x = sc.nextInt();
				try {
					System.out.println();
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� �����ϴ�.");
				}
				break;

			case 2:

				try {

					System.out.println("���� �����ʹ� " + s.dequeue() + "�Դϴ�.");
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 4:
				try {
					s.dump();
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;

			case 5:
				try {
					System.out.println("������ �ʱ�ȭ �Ǿ����ϴ�.");
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 6:
				try {
					x = s.capacity();
					System.out.println("�뷮�� " + x + "�Դϴ�.");
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 7:
				try {
					x = s.size();
					System.out.println("���� ũ��� " + s.size() + "�Դϴ�.");
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("������ ����ֽ��ϴ�.");

				}

			}
		}

	}
}


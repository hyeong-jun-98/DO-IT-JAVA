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
		max = capacity; // 용량
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

			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			System.out.print("(1)푸시  (2)팝  (3)피크 (4)덤프  (5)초기화  (6)용량  (7)크기  (0)종료 : ");

			int menu = sc.nextInt();
			if (menu == 0) {
				System.out.println("종료 되었습니다.");
				break;
			}

			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 :");
				x = sc.nextInt();
				try {
					System.out.println();
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찻습니다.");
				}
				break;

			case 2:

				try {

					System.out.println("팝한 데이터는 " + s.dequeue() + "입니다.");
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 4:
				try {
					s.dump();
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;

			case 5:
				try {
					System.out.println("스택이 초기화 되었습니다.");
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 6:
				try {
					x = s.capacity();
					System.out.println("용량은 " + x + "입니다.");
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");
				}
				break;
			case 7:
				try {
					x = s.size();
					System.out.println("현재 크기는 " + s.size() + "입니다.");
					System.out.println();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어있습니다.");

				}

			}
		}

	}
}


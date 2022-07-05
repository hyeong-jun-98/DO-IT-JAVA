import java.util.Scanner;

class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;

	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	public IntQueue(int capacity) {
		max = capacity;
		num = front = rear = 0; // �ʱ�ȭ, num�� ������ rear�� front�� ���� �� �����Ͱ� �ִ��� ������ üũ�� �Ұ����ϴ�.
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0; // �迭 ��ü�� ������ ������ ��� max���� 0��,�� �Ѵ�. �̷��� �ϸ� �ٸ� �޼��尡 �������� �ʴ� �迭�� �߸� �����ϴ� ���� ���� ��
						// ����.
		}
	}

	public int Enque(int x) throws OverflowIntQueueException {
		if(num >= max) {
			throw new OverflowIntQueueException();
		} else {
			que[rear++] = x;
			num++;
			if(rear == max) { // rear ���� max�� �ѰԵǸ� 0���� �ʱ�ȭ ���ش�.  ����ť�̱� ����.
				rear = 0;
			} return x;
		}
	}
	public int Deque() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		} else {
			int x = que[front++];
			num--;
			if(front == max) {
				front = 0;
			} return x;
		} 
	}

	public int peek() throws EmptyIntQueueException{
		if(num <= 0) {
			throw new EmptyIntQueueException();
		} else {
			return que[front];
		}
	}
	  
	
}

public class chap04 {

	public static void main(String[] args) {

	}

}

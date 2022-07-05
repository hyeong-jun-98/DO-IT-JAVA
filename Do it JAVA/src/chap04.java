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
		num = front = rear = 0; // 초기화, num이 없으면 rear랑 front가 같을 때 데이터가 있는지 없는지 체크가 불가능하다.
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0; // 배열 본체의 생성에 실패할 경우 max값을 0ㅇ,로 한다. 이렇게 하면 다른 메서드가 존재하지 않는 배열에 잘못 접근하는 것을 막을 수
						// 없다.
		}
	}

	public int Enque(int x) throws OverflowIntQueueException {
		if(num >= max) {
			throw new OverflowIntQueueException();
		} else {
			que[rear++] = x;
			num++;
			if(rear == max) { // rear 값이 max를 넘게되면 0으로 초기화 해준다.  원형큐이기 때문.
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

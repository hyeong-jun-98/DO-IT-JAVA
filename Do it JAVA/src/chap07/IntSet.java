package chap07;

public class IntSet {
	private int max;
	private int count;
	private int[] set;

	public IntSet(int capacity) {
		count = 0;
		max = capacity;

		try {
			set = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}

	}

	public int capacity() {
		return max;
	}

	public int size() {
		return count;
	}
	
	

	public static void main(String[] args) {

	}

}

package chapter15;

public class chapter15_10 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] numbers = new int[1000000];
		
		for (int i = 0; i < 1000000; i++) {
			numbers[i] = i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("処理時間 : " + (end - start));
	}
}

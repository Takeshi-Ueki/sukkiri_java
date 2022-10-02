package chapter4;

public class Q4_4 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		
		int input = new java.util.Scanner(System.in).nextInt();
		
		for (int number : numbers) {
			if (number == input) {
				System.out.println("アタリ！");
			}
		}
	}
}

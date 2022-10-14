package jissen_chapter1;

import java.util.Arrays;

public class Chapter1_4 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		
		System.out.println("a.equals(b):" + a.equals(b));
		System.out.println("a.Arrays.equals(b):" + Arrays.equals(a, b));
	}
}

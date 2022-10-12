package chapter15;

public class Chapter15_Q1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 100; i++) {
			sb.append(i + ",");
		}
		
		String s = sb.toString();
		String[] a = s.split(",");
		System.out.println(s);
		
	}
}

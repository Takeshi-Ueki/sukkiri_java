package chapter15;

public class Main3 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		
		for (String w : words) {
			System.out.print(w + "->");
		}
		
		System.out.println();
		
		String w = s.replaceAll("[deh]", "X");
		System.out.println(w);
	}
}

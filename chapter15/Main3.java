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
		
		System.out.println("---------------");
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s2 = String.format
				(FORMAT, "taro", "hero", 10000);
		System.out.println(s2);
		
		System.out.printf("製品番号%s-%02d", "SVJ", 3);
	}
}

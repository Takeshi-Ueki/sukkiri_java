package chapter16;

import java.util.HashSet;
import java.util.Set;

public class Chapter16_3 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		System.out.println("色は" + colors.size() + "色");
		
		colors.add("赤");  //  重複する値は無視される
		System.out.println("色は" + colors.size() + "色");

		for (String color : colors) {
			System.out.print(color + "⇒");  //  表示順序は保証されない
		}
	}
}

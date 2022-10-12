package chapter16;

import java.util.Set;
import java.util.TreeSet;

public class Chapter16_5 {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");

		for (String s : words) {
			System.out.print(s + "→");
		}
	}
}

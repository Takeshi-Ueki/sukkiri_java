package chapter17;

import java.io.FileWriter;

public class Chapter17_10 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("何らかのエラーが発生しました");
		}
	}
}

package jissen_chapter2;

public class Chapter2_3 {
	public static void main(String[] args) {
		BeforePocket p = new BeforePocket();
		p.put("1192");
		String s = (String)p.get();
		System.out.println(s);
	}
}

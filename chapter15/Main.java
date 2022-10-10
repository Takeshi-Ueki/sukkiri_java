package chapter15;

public class Main {
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "Java";
		String s3 = "java";
		
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		
		// Java とJAVA は true		
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		
		System.out.println("s1の長さは" + s1.length() + "です");
		
		// 空文字かどうか調べる		
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
		
		String s10 = "Java ad JavaScript";
		String s11 = "Python Ruby Java";
		
		if (s10.contains("Java")) {
			System.out.println("s10はJavaを含む");
		}
		if (s11.endsWith("Java")) {
			System.out.println("文字列s11はJavaが末尾にあります");
		}
		
		System.out.println("文字列s10で最初にJavaが登場する位置は" + 
				s10.indexOf("Java"));
		System.out.println("文字列s10で最後にJavaが登場する位置は" + 
				s10.lastIndexOf("Java"));
		
		System.out.println("文字列s10の4文字目以降は" + s10.substring(3));
		System.out.println("文字列s10の4~8文字目は" + s10.substring(3, 8));
	}
}

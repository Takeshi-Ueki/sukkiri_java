package chapter15;

public class Main2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
				
		for (int i = 0; i < 10; i++) {
			sb.append("Java");
		}
		
		String s = sb.toString();
		System.out.println(s);
	
		String s2 = "Java";
		
		System.out.println(s2.matches("Java"));
		System.out.println(s2.matches("JavaJava"));
		System.out.println(s2.matches("java"));
		
		//	１文字目はJ 2文字目 . はなんでもいい
		System.out.println(s2.matches("J.va"));
		
		String s3 = "Jaaaaaava";
		
		//	* は	0文字以上の繰り返し
		System.out.println("Ja*va;" + s3.matches("Ja*va"));
		
		String s4 = "apple";
		System.out.println("apple:[a-z]{5} = " + s4.matches("[a-z]{5}"));
	}
}

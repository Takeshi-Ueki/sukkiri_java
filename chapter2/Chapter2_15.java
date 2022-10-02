package chapter2;

import java.util.Scanner;

public class Chapter2_15 {
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力してください");
		Scanner sc = new java.util.Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("あなたの年齢を入力してください");
		
		int age = sc.nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
		
		sc.close();
	}
}

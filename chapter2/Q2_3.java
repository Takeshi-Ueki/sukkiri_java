package chapter2;

import java.util.Scanner;

public class Q2_3 {
	 public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力ください");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		System.out.println("あなたの年齢を入力してください");
		
		String ageString = sc.nextLine();
		int age = Integer.parseInt(ageString);
		
		int fortune = new java.util.Random().nextInt(3);
		fortune++;
		
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4;凶");
		
		sc.close();
	}
}

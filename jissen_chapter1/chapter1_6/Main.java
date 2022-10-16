package jissen_chapter1.chapter1_6;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		Sword s = new Sword("鋼の剣");
		
		h1.setSword(s);
		System.out.println("装備:" + h1.getSword().getName());
		System.out.println("clone()で複製");
		
		Hero h2 = h1.clone();
		
		Sword s2 = new Sword("ヒノキの棒");
		
		System.out.println("コピー元のHeroの剣の名前を変えます");
		h1.setSword(s2);
		
		System.out.println("コピー元とコピー後の勇者の装備を表示");
		System.out.println("コピー元装備:" + h1.getSword().getName());
		System.out.println("コピー先装備:" + h2.getSword().getName());
	}
}

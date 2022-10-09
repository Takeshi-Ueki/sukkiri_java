package chapter14;

public class Main {
	public static void main(String[] args) {
		
		Hero.setRandomMoney();
		
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println(h.toString());
		
		Hero h2 = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		if (h.equals(h2)) {
			System.out.println("同じ内容です。");
		} else {
			System.out.println("違う内容です");
		}
		
		System.out.println(Hero.money);
		
		h.money = 300;
		
		System.out.println(h.money);
	}
}

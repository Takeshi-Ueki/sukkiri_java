package chapter9_1;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "騎士の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h);
		w.heal(h2);
		w.heal(h2);
	}
}

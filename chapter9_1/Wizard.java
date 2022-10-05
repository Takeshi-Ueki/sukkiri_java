package chapter9_1;

public class Wizard {
	String name;
	int hp;
	public void heal(chapter9_1.Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}
}

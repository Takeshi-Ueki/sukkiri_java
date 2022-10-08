package chapter12;

public class Main {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Character c = w;
		Matango m = new Matango();
		c.name = "アサカ";
		c.attack(m);
		//  Character に代入しているため、コンパイルエラーになる
		//  c.fireball(m);
		
		//  Character から Wizard	 は castする必要がある
		//	Wizard w = c;
		Wizard w2 = (Wizard)c;
		
		w2.fireball(m);
		
		Slime s = new Slime(); Monster mo = new Slime();
		//  mo にもSlime が入っているため、メソッドはSlimeで定義したメソッドが呼び出される		
		s.run(); mo.run();
		
		System.out.println("---------------");
		
		Character[] c2 = new Character[5];
		
		c2[1] = new Hero();
		c2[2] = new Hero();
		c2[3] = new Wizard();
		c2[4] = new Wizard();
		c2[5] = new Wizard();
		
		for (Character ch : c2) {
			ch.hp += 50;
		}
	}
}

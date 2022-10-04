package chapter8;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();		
		h.name = "田中";
		h.hp = 100;
		
		Matango m1 = new Matango();
		Matango m2 = new Matango();
		
		m1.hp = 50;
		m2.hp = 48;
		m1.suffix = 'A';
		m2.suffix = 'B';
		
		h.sit(5);
		h.slip();
		h.sit(25);
		m1.run();
		m2.run();
		h.run();
	}
}

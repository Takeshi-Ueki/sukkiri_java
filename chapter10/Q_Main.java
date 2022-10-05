package chapter10;

public class Q_Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		PoisonMatango pm = new PoisonMatango('A');
		
		h.attack(pm);
		pm.attack(h);
		
		h.run();
	}
}

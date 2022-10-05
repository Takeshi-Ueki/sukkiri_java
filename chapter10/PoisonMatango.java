package chapter10;

public class PoisonMatango extends Matango{
	int count = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {
		super.attack(h);
		if (this.count > 0) {
			System.out.println("さらに毒攻撃！");
			int damage = h.hp /5;
			h.hp -= damage;
			System.out.println(damage + "のダメージ！");
			count--;
		}
	}
}

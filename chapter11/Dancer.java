package chapter11;

public class Dancer extends Character{
	public Dancer(String name, int hp, int mp) {
		super(name, hp, mp);
	}

	String name;
	
	public void donce() {
		System.out.println(this.name + "は情熱的に踊った！");
	}

	// 抽象メソッドをオーバーライドし忘れるとコンパイルエラーになる
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3; 
	}
}

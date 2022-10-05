package chapter9_2;

public class Hero {
	String name;
	int hp;
	
	public Hero() {
		this("ダミー");
	}
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
}

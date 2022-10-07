package chapter11;

public abstract class Character {
	String name;
	int hp;
	int mp;
	
	public Character(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Character(String name, int hp) {
		this(name, hp, 5);
	}
	public Character(String name) {
		this(name, 100);
	}
	
	public abstract void attack(Matango m);
}

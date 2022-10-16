package jissen_chapter1.chapter1_6;

public class Hero implements Cloneable{
	String name;
	int hp;
	Sword sword;
	
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	}
	
	public void setSword(Sword s) {
		this.sword = s;
	}
	public Sword getSword() {
		return this.sword;
	}
}

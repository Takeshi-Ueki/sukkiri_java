package chapter8;

import java.util.Random;

public class Cleric {
	String name;
	int hp    = 100;
	final int MAXHP = 100;
	int mp    = 10;
	final int MAXMP = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = MAXHP;
	}
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒天に祈った");
		
		int recovery = new Random().nextInt(3) + sec;
		
		int recoveryActual = Math.min(this.MAXMP - this.mp, recovery);
		
//		if (mp + recovery < MAXMP) {
//			mp = MAXMP;
//		} else {
//			mp += recovery;
//		}
		
		this.mp += recoveryActual;
		System.out.println("MPが" + recoveryActual + "回復した！");
		return recoveryActual;
	}
}

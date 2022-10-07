package chapter11;

// implements Hero, Princess, Character のように多重継承が許されている
// 継承と実装を同時に行う場合 extends Character implements Human { のような書き方をする
public class KyotoCleaningshop implements CleaningService {
	String ownerName;
	
	public Shirt washShirt(Shirt s) {
		return s;
	}
	public Towl washTowl(Towl t) {
		return t;
	}
	public Coat washCoat(Coat c) {
		return c;
	}
}

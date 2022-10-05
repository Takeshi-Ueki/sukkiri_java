package chapter11;

// implements で多重継承が許されている
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

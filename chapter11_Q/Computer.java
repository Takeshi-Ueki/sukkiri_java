package chapter11_Q;

public class Computer extends TangleAsset{
	String makerName;
	
	//	コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}
	
	//	メソッド
	public String getMakerName() {
		return makerName;
	}
}

package chapter11_Q;

public class Book extends TangleAsset{
	String isbn;
	
	//　コンストラクタ	
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	
	// メソッド
	public String getIsbn(){
		return this.isbn;
	};
}

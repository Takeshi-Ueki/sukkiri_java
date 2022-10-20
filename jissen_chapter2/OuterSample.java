package jissen_chapter2;

public class OuterSample {
	public static void main(String[] args) {
		
		//  static 付 メンバクラスは独立でインスタンス化可能
		//  Outer.Inner ic = new Outer.Inner();
		
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		oi.innerMethod();
		
		System.out.println(o.getOuterStaticField());
	}
}

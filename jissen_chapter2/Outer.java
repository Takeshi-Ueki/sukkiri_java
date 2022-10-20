package jissen_chapter2;

public class Outer {
	int outerField;
	static int outerStaticField;
	
	//  static 付 メンバクラス
	//  static class Inner {
	
	//  static 無し メンバクラス
	class Inner {
		void innerMethod() {
			outerStaticField = 10;
		}
	}
	void outerMethod() {
		Inner ic = new Inner();
	}
	
	public static int getOuterStaticField() {
		return outerStaticField;
	}
}

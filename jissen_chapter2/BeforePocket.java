// ジェネリクスを使用しないクラス

package jissen_chapter2;

public class BeforePocket {
	private Object data;
	public void put(Object b) {
		this.data = b;
	}
	public Object get() {
		return this.data;
	}
}

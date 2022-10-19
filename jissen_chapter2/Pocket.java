//  ジェネリクスを使用したクラス

package jissen_chapter2;

//  <E>は仮想引数という Eがどのような型になるかはこの時点では決まっていない
//　変数宣言の段階で指定した型で E が変換される
public class Pocket<E> {
	private E data;
	public void put(E d) {
		this.data = d;
	}
	public E get() {
		return this.data;
	}
}

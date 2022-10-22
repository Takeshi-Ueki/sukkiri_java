//  Optionalクラスの利用

package jissen_chapter2;

import java.util.Optional;

public class Chapter2_14 {
	//  文字列 s を文字 c ではさんで装飾するメソッド
	//  ・文字列 s が null または長さ0の場合は、 null を返す
	//  ・戻り値は「nullの可能性がある」ことを明示するために、
	//   単なるString ではなく Optional<String> とする。
	public static Optional<String> decorate(String s, char c) {
		String r;
		if (s == null || s.length() == 0) {
			r = null;
		} else {
			r = c + s + c;
		}
		return Optional.ofNullable(r);
	}

	public static void main(String[] args) {
		Optional<String> s = decorate("", '*');
		System.out.println(s.orElse("nullのため処理できません"));
	}
}

package chapter15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Chapter15_16 {

	public static void main(String[] args) {
		//	文字列からLocalDateを生成
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
		
		//  1000日後を計算
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);
		
		//	現在日時との比較
		LocalDate now = LocalDate.now();
		if (now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
		}
	}
}

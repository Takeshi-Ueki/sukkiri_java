package chapter15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Chapter15_Q4 {
	public static void main(String[] args) {
		//	現在日時を取得
		Date now = new Date();
		
		//	Calendarにセット
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		
		//	Calendar c から「日」の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		day += 100;
		
		//	100足した「日」をCalendar ｃ にセット	
		c.set(Calendar.DAY_OF_MONTH, day);
		
		Date future = c.getTime();
		
		//	設定したformatで表示 
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future));
	}
}

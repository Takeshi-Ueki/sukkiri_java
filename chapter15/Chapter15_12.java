// Calendar型について

package chapter15;

import java.util.Calendar;
import java.util.Date;

public class Chapter15_12 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2019, 8, 22, 1, 23, 45);
		
		Date d = c.getTime();
		System.out.println(d);
		
		c.set(Calendar.MONTH, 9);  //月を９に変更(１０月)
		d = c.getTime();
		System.out.println(d);
		
		Date now = new Date();
		
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}
}
